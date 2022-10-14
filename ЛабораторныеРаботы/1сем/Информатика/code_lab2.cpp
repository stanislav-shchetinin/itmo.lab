#include <bits/stdc++.h>

using namespace std;

char to_int(char c){
    return c - '0';
}
//001110010110100
void get_pos (string s){
    int ans = 0;
    int n = s.size();
    long long d = 0;
    vector <int> pos_2x;

    while ((1 << d) <= n){
        pos_2x.push_back((1 << d) - 1);
        ++d;

    }

    vector <int> sdrm;

    for (auto d : pos_2x){
        int cur_sd = 0;
        for (int i = d; i < n; i += 2 * (d + 1)){

            for (int j = i; j < min(n, i + d + 1); ++j){
                cur_sd ^= to_int(s[j]);
            }
        }
        sdrm.push_back(cur_sd);
    }

    int pos = 0;

    for (int i = 0; i < sdrm.size(); ++i){
        pos += (1 << i) * sdrm[i];
    }

    if (pos == 0){
        cout << "No wrong" << endl;
        return;
    }

    d = 0;

    while ( (1 << (d + 1)) <= pos ){
        ++d;
    }

    if ( (1 << d) == pos ){
        cout << 'r' << d + 1 << endl;
    } else {
        cout << 'i' << pos - (1 << d) + 1 << endl;
    }
    s[pos - 1] = 1 - to_int(s[pos - 1]) + '0';
    for (int i = 0; i < n; ++i){
        if (((i + 1) & (i)) != 0){ //i + 1 - степень 2
            cout << s[i];
        }
    }
    cout << endl;

}

int main() {

    string s;
    cin >> s;

    get_pos(s);

}
