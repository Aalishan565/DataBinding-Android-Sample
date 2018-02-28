package allu.databindingsample.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import allu.databindingsample.R;
import allu.databindingsample.databinding.UserDataBinding;
import allu.databindingsample.model.User;
import allu.databindingsample.presenter.GetDataAction;

public class MainActivity extends AppCompatActivity implements GetDataAction {
    private User user;
    private UserDataBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        binding.setUser(user);
        binding.setPresenter(this);
    }


    @Override
    public void getData(User user) {
        binding.tvFname.setText(user.getFirstName());
        binding.tvLname.setText(user.getLastName());
    }
}
