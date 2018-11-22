package info.cmn.projectminhasfinancas;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;

public class RetrieveOnClick implements View.OnLongClickListener{

    Context context;
    String id;

    @Override
    public boolean onLongClick(View v) {
//
//        context = v.getContext();
//        id = v.getTag().toString();
//        final CharSequence[] itens = {"Editar", "Deletar"};
//
//        new AlertDialog.Builder(context).setTitle("Detalhes")
//                .setItems(itens, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int item) {
//                        if (item == 0){
//
//                        } else if (item == 1){
//
//                        }
//                    }
//                }).show();
        Toast.makeText(v.getContext(),"Clicando em um item", Toast.LENGTH_SHORT).show();
        return false;
    }


}
