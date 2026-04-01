// class Solution {
// public:
//     int myAtoi(string s) {
//         regex r("[-]?\\d+");  
//         smatch m;
//         if((!isalpha(s[0]) && s[0] != '.' && s[0] != '#' && s[0] != '%' && s[0] != '@'){
//             if (regex_search(s, m, r)) {
//             string numStr = m.str();
//             try {
//                 return stoi(numStr); 
//             } catch (...) {
//                 if (numStr[0] == '-') return INT_MIN;
//                 return INT_MAX;
//             }
//         }
//         }
//         return 0;  
//     }
// };

class Solution {
public:
    int myAtoi(string s) {
        if (s.empty()) return 0;

        // Skip leading whitespaces
        int i = 0;
        while (i < s.size() && s[i] == ' ') i++;
        if (i == s.size()) return 0;

        // Optional + or - sign
        bool negative = false;
        if (s[i] == '+' || s[i] == '-') {
            negative = (s[i] == '-');
            i++;
        }

        // Parse digits
        long long result = 0;
        while (i < s.size() && isdigit(s[i])) {
            result = result * 10 + (s[i] - '0');
            // Clamp to INT_MIN / INT_MAX
            if (!negative && result > INT_MAX) return INT_MAX;
            if (negative && -result < INT_MIN) return INT_MIN;
            i++;
        }

        return negative ? -result : result;
    }
};