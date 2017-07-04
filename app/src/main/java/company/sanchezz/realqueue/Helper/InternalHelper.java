package company.sanchezz.realqueue.Helper;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

/**
 * Created by AlejandroSanchez on 7/3/17.
 */

public class InternalHelper {


    public static final String PREFS_FILE = "TOKEN_FILE";


    public static boolean isEmailValid(String email) {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public static boolean isPasswordValid(String password) {
        return password.length() > 5;
    }

    public static void validateLogin(String email, String password, final Context context) {

    }



}
