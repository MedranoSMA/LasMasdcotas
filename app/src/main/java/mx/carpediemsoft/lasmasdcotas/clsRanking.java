package mx.carpediemsoft.lasmasdcotas;
import java.util.Scanner;

/**
 * Created by Usuario on 14/09/2016.
 */
public class clsRanking {

    private TextView leer;
    ImageView likes = (ImageView) findViewById(R.id.likes);

    likes.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {


        Scanner leer = new Scanner(TextView);

        leer = leer.nextInt();
        int[] num = new int[totNum];

        for(int i = 0; i < num.length; i++){

            num[i] = leer.nextInt();
        }

        for(int i = 0; 1 < num.length; i++){
            System.out.println(num[i]);
        }



        for(int i =num.length-1; i>=0; i--){
            System.out.println(num[i]);
        }
        }
            Intent ranking = new Intent(getApplicationContext(), ranking.class);
            startActivity(ranking);

        });

}
