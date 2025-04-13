package com.xworkz.tarun.internal;

public class TeaShop {

    // The debit method accepts a parent type (Account) and then uses instanceof checks
    public void debit(Account account) {
        if (account != null) {
            // Common processing
            account.credentials();

            // Check if the account is a DigitalAccount
            if (account instanceof DigitalAccount) {
                DigitalAccount digitalAccount = (DigitalAccount) account;  // casting to proper type
                digitalAccount.autoLogin();
                digitalAccount.add();
            }
            // Check for other types
            else if (account instanceof AccountType001) {
                AccountType001 type001 = (AccountType001) account;
                type001.add();
            } else if (account instanceof AccountType002) {
                AccountType002 type002 = (AccountType002) account;
                type002.add();
            }
            else if (account instanceof AccountType003) {
                AccountType003 type003 = (AccountType003) account;
                type003.add();
            }
            else if (account instanceof AccountType004) {
                AccountType004 type004 = (AccountType004) account;
                type004.add();
            }
            else if (account instanceof AccountType005) {
                AccountType005 type005 = (AccountType005) account;
                type005.add();
            }
            else if (account instanceof AccountType006) {
                AccountType006 type006 = (AccountType006) account;
                type006.add();
            }
            else if (account instanceof AccountType007) {
                AccountType007 type007 = (AccountType007) account;
                type007.add();
            }
            else if (account instanceof AccountType008) {
                AccountType008 type008 = (AccountType008) account;
                type008.add();
            }
            else if (account instanceof AccountType009) {
                AccountType009 type009 = (AccountType009) account;
                type009.add();
            }
            else if (account instanceof AccountType0010) {
                AccountType0010 type0010 = (AccountType0010) account;
                type0010.add();
            }
            else if (account instanceof AccountType0011) {
                AccountType0011 type0011 = (AccountType0011) account;
                type0011.add();
            }
            else if (account instanceof AccountType0012) {
                AccountType0012 type0012 = (AccountType0012) account;
                type0012.add();
            }
            else if (account instanceof AccountType0013) {
                AccountType0013 type0013 = (AccountType0013) account;
                type0013.add();
            }
            else if (account instanceof AccountType0014) {
                AccountType0014 type0014 = (AccountType0014) account;
                type0014.add();
            }
            else if (account instanceof AccountType0015) {
                AccountType0015 type0015 = (AccountType0015) account;
                type0015.add();
            }
            else if (account instanceof AccountType0016) {
                AccountType0016 type0016 = (AccountType0016) account;
                type0016.add();
            }
            else if (account instanceof AccountType0017) {
                AccountType0017 type0017 = (AccountType0017) account;
                type0017.add();
            }
            else if (account instanceof AccountType0018) {
                AccountType0018 type0018 = (AccountType0018) account;
                type0018.add();
            }
            else if (account instanceof AccountType0019) {
                AccountType0019 type0019 = (AccountType0019) account;
                type0019.add();
            }
            else if (account instanceof AccountType0020) {
                AccountType0020 type0020 = (AccountType0020) account;
                type0020.add();
            }
            else if (account instanceof AccountType0021) {
                AccountType0021 type0021 = (AccountType0021) account;
                type0021.add();
            }
            else if (account instanceof AccountType0022) {
                AccountType0022 type0022 = (AccountType0022) account;
                type0022.add();
            }
            else if (account instanceof AccountType0023) {
                AccountType0023 type0023 = (AccountType0023) account;
                type0023.add();
            }
            else if (account instanceof AccountType0024) {
                AccountType0024 type0024 = (AccountType0024) account;
                type0024.add();
            }
            else if (account instanceof AccountType0025) {
                AccountType0025 type0025 = (AccountType0025) account;
                type0025.add();
            }
            else if (account instanceof AccountType0026) {
                AccountType0026 type0026 = (AccountType0026) account;
                type0026.add();
            }
            else if (account instanceof AccountType0027) {
                AccountType0027 type0027 = (AccountType0027) account;
                type0027.add();
            }
            else if (account instanceof AccountType0028) {
                AccountType0028 type0028 = (AccountType0028) account;
                type0028.add();
            }
            else if (account instanceof AccountType0029) {
                AccountType0029 type0029 = (AccountType0029) account;
                type0029.add();
            }
            else if (account instanceof AccountType0030) {
                AccountType0030 type0030 = (AccountType0030) account;
                type0030.add();
            }
            else if (account instanceof AccountType0031) {
                AccountType0031 type0031 = (AccountType0031) account;
                type0031.add();
            }
            else if (account instanceof AccountType0032) {
                AccountType0032 type0032 = (AccountType0032) account;
                type0032.add();
            }
            else if (account instanceof AccountType0033) {
                AccountType0033 type0033 = (AccountType0033) account;
                type0033.add();
            }
            else if (account instanceof AccountType0034) {
                AccountType0034 type0034 = (AccountType0034) account;
                type0034.add();
            }
            else if (account instanceof AccountType0035) {
                AccountType0035 type0035 = (AccountType0035) account;
                type0035.add();
            }
            else if (account instanceof AccountType0036) {
                AccountType0036 type0036 = (AccountType0036) account;
                type0036.add();
            }
            else if (account instanceof AccountType0037) {
                AccountType0037 type0037 = (AccountType0037) account;
                type0037.add();
            }
            else if (account instanceof AccountType0038) {
                AccountType0038 type0038 = (AccountType0038) account;
                type0038.add();
            }
            else if (account instanceof AccountType0039) {
                AccountType0039 type0038 = (AccountType0039) account;
                type0038.add();
            }
            else if (account instanceof AccountType0039) {
                AccountType0039 type0039 = (AccountType0039) account;
                type0039.add();
            }
            else if (account instanceof AccountType0040) {
                AccountType0040 type0040 = (AccountType0040) account;
                type0040.add();
            }

            else if (account instanceof AccountType0041) {
                AccountType0041 type0041 = (AccountType0041) account;
                type0041.add();
            }
            else if (account instanceof AccountType0042) {
                AccountType0042 type0042 = (AccountType0042) account;
                type0042.add();
            }
            else if (account instanceof AccountType0043) {
                AccountType0043 type0043 = (AccountType0043) account;
                type0043.add();
            }
            else if (account instanceof AccountType0044) {
                AccountType0044 type0044 = (AccountType0044) account;
                type0044.add();
            }
            else if (account instanceof AccountType0045) {
                AccountType0045 type0045 = (AccountType0045) account;
                type0045.add();
            }
            else if (account instanceof AccountType0046) {
                AccountType0046 type0046 = (AccountType0046) account;
                type0046.add();
            }
            else if (account instanceof AccountType0047) {
                AccountType0047 type0047 = (AccountType0047) account;
                type0047.add();
            }
            else if (account instanceof AccountType0048) {
                AccountType0048 type0048 = (AccountType0048) account;
                type0048.add();
            }
            else if (account instanceof AccountType0049) {
                AccountType0049 type0049 = (AccountType0049) account;
                type0049.add();
            }
            else if (account instanceof AccountType0050) {
                AccountType0050 type0050 = (AccountType0050) account;
                type0050.add();
            }

            else if (account instanceof AccountType0051) {
                AccountType0051 type0051 = (AccountType0051) account;
                type0051.add();
            }
            else if (account instanceof AccountType0052) {
                AccountType0052 type0052 = (AccountType0052) account;
                type0052.add();
            }
            else if (account instanceof AccountType0053) {
                AccountType0053 type0053 = (AccountType0053) account;
                type0053.add();
            }
            else if (account instanceof AccountType0054) {
                AccountType0054 type0054 = (AccountType0054) account;
                type0054.add();
            }
            else if (account instanceof AccountType0055) {
                AccountType0055 type0055 = (AccountType0055) account;
                type0055.add();
            }
            else if (account instanceof AccountType0056) {
                AccountType0056 type0056 = (AccountType0056) account;
                type0056.add();
            }
            else if (account instanceof AccountType0057) {
                AccountType0057 type0057 = (AccountType0057) account;
                type0057.add();
            }
            else if (account instanceof AccountType0058) {
                AccountType0058 type0058 = (AccountType0058) account;
                type0058.add();
            }
            else if (account instanceof AccountType0059) {
                AccountType0059 type0059 = (AccountType0059) account;
                type0059.add();
            }
            else if (account instanceof AccountType0060) {
                AccountType0060 type0060 = (AccountType0060) account;
                type0060.add();
            }

            else if (account instanceof AccountType0061) {
                AccountType0061 type0061 = (AccountType0061) account;
                type0061.add();
            }
            else if (account instanceof AccountType0062) {
                AccountType0062 type0062 = (AccountType0062) account;
                type0062.add();
            }
            else if (account instanceof AccountType0063) {
                AccountType0063 type0063 = (AccountType0063) account;
                type0063.add();
            }
            else if (account instanceof AccountType0064) {
                AccountType0064 type0064 = (AccountType0064) account;
                type0064.add();
            }
            else if (account instanceof AccountType0065) {
                AccountType0065 type0065 = (AccountType0065) account;
                type0065.add();
            }
            else if (account instanceof AccountType0066) {
                AccountType0066 type0066 = (AccountType0066) account;
                type0066.add();
            }
            else if (account instanceof AccountType0067) {
                AccountType0067 type0067 = (AccountType0067) account;
                type0067.add();
            }
            else if (account instanceof AccountType0068) {
                AccountType0068 type0068 = (AccountType0068) account;
                type0068.add();
            }
            else if (account instanceof AccountType0069) {
                AccountType0069 type0069 = (AccountType0069) account;
                type0069.add();
            }
            else if (account instanceof AccountType0070) {
                AccountType0070 type0070 = (AccountType0070) account;
                type0070.add();
            }

            else if (account instanceof AccountType0071) {
                AccountType0071 type0071 = (AccountType0071) account;
                type0071.add();
            }
            else if (account instanceof AccountType0072) {
                AccountType0072 type0072 = (AccountType0072) account;
                type0072.add();
            }
            else if (account instanceof AccountType0073) {
                AccountType0073 type0073 = (AccountType0073) account;
                type0073.add();
            }
            else if (account instanceof AccountType0074) {
                AccountType0074 type0074 = (AccountType0074) account;
                type0074.add();
            }
            else if (account instanceof AccountType0075) {
                AccountType0075 type0075 = (AccountType0075) account;
                type0075.add();
            }
            else if (account instanceof AccountType0076) {
                AccountType0076 type0076 = (AccountType0076) account;
                type0076.add();
            }
            else if (account instanceof AccountType0077) {
                AccountType0077 type0077 = (AccountType0077) account;
                type0077.add();
            }
            else if (account instanceof AccountType0078) {
                AccountType0078 type0078 = (AccountType0078) account;
                type0078.add();
            }
            else if (account instanceof AccountType0079) {
                AccountType0079 type0079 = (AccountType0079) account;
                type0079.add();
            }
            else if (account instanceof AccountType0080) {
                AccountType0080 type0080 = (AccountType0080) account;
                type0080.add();
            }

            else if (account instanceof AccountType0081) {
                AccountType0081 type0081 = (AccountType0081) account;
                type0081.add();
            }
            else if (account instanceof AccountType0082) {
                AccountType0082 type0082 = (AccountType0082) account;
                type0082.add();
            }
            else if (account instanceof AccountType0083) {
                AccountType0083 type0083 = (AccountType0083) account;
                type0083.add();
            }
            else if (account instanceof AccountType0084) {
                AccountType0084 type0084 = (AccountType0084) account;
                type0084.add();
            }
            else if (account instanceof AccountType0085) {
                AccountType0085 type0085 = (AccountType0085) account;
                type0085.add();
            }
            else if (account instanceof AccountType0086) {
                AccountType0086 type0086 = (AccountType0086) account;
                type0086.add();
            }
            else if (account instanceof AccountType0087) {
                AccountType0087 type0087 = (AccountType0087) account;
                type0087.add();
            }
            else if (account instanceof AccountType0088) {
                AccountType0088 type0088 = (AccountType0088) account;
                type0088.add();
            }
            else if (account instanceof AccountType0089) {
                AccountType0089 type0089 = (AccountType0089) account;
                type0089.add();
            }
            else if (account instanceof AccountType0090) {
                AccountType0090 type0090 = (AccountType0090) account;
                type0090.add();
            }

            else if (account instanceof AccountType0091) {
                AccountType0091 type0091 = (AccountType0091) account;
                type0091.add();
            }
            else if (account instanceof AccountType0092) {
                AccountType0092 type0092 = (AccountType0092) account;
                type0092.add();
            }
            else if (account instanceof AccountType0093) {
                AccountType0093 type0093 = (AccountType0093) account;
                type0093.add();
            }
            else if (account instanceof AccountType0094) {
                AccountType0094 type0094 = (AccountType0094) account;
                type0094.add();
            }
            else if (account instanceof AccountType0095) {
                AccountType0095 type0095 = (AccountType0095) account;
                type0095.add();
            }
            else if (account instanceof AccountType0096) {
                AccountType0096 type0096 = (AccountType0096) account;
                type0096.add();
            }
            else if (account instanceof AccountType0097) {
                AccountType0097 type0097 = (AccountType0097) account;
                type0097.add();
            }
            else if (account instanceof AccountType0098) {
                AccountType0098 type0098 = (AccountType0098) account;
                type0098.add();
            }
            else if (account instanceof AccountType0099) {
                AccountType0099 type0099 = (AccountType0099) account;
                type0099.add();
            }
            else if (account instanceof AccountType0100) {
                AccountType0100 type0100 = (AccountType0100) account;
                type0100.add();
            }


            else {
                System.err.println("Account type not recognized or extra method not available.");
            }
        } else {
            System.err.println("Account is null.");
        }
    }
}