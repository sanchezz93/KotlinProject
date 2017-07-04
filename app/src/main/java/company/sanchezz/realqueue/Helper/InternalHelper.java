package company.sanchezz.realqueue.Helper;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import company.sanchezz.realqueue.R;
import company.sanchezz.realqueue.Views.ListSelectionActivity;

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

    public static void buildDialog(final Context context) {

        AlertDialog.Builder alertDialogBuilder =
                new AlertDialog.Builder(context);

        LayoutInflater layoutInflater = LayoutInflater.from(context.getApplicationContext());
        final View view = layoutInflater.inflate(R.layout.dialog_edit_and_select, null);

        final EditText textTitle = (EditText) view.findViewById(R.id.textTitle);



        alertDialogBuilder.setTitle(context.getResources().getString(R.string.name));
        alertDialogBuilder
                .setView(view)
                .setCancelable(true)
                .setNegativeButton(context.getResources().getString(R.string.cancel),
                        new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .setPositiveButton(context.getResources().getString(R.string.create),
                        new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String title =  textTitle.getText().toString();
                        Intent intent = new Intent(context, ListSelectionActivity.class);
                        intent.putExtra(context.getResources().getString(R.string.extra_title),
                                title);
                        context.startActivity(intent);
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


}
