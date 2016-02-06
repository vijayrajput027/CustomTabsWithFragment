package in.vijay.custombuttontab;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Vijay on 2/6/2016.
 */
public class LoginEnquiryFragment extends Fragment {


    private Button btnCustomer, btnProduct;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.login_enquiry_fragment, container, false);

        btnCustomer = (Button) rootView.findViewById(R.id.loginEnquiry);
        btnProduct = (Button) rootView.findViewById(R.id.productId);


        btnCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager
                        .beginTransaction();
                LoginEnquiryFragment fragmentS1 = new LoginEnquiryFragment();
                fragmentTransaction.replace(android.R.id.content, fragmentS1);
                fragmentTransaction.commit();
            }
        });

        btnProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager
                        .beginTransaction();
                ProductFragment fragmentS1 = new ProductFragment();
                fragmentTransaction.replace(android.R.id.content, fragmentS1);
                fragmentTransaction.commit();
            }
        });


        return rootView;
    }
}