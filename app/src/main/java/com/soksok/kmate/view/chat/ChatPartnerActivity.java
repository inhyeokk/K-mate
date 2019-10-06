package com.soksok.kmate.view.chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.soksok.kmate.R;
import com.soksok.kmate.common.BindUtils;
import com.soksok.kmate.databinding.ActivityChatPartnerBinding;

public class ChatPartnerActivity extends AppCompatActivity {

    private String email;

    private ActivityChatPartnerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getData();
        onDataBinding();
        setupViews();
    }

    private void getData() {
        email = getIntent().getStringExtra(ChatActivity.EXTRA_CHAT_PARTNER_EMAIL);
    }

    private void onDataBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_chat_partner);
    }

    private void setupViews() {
        BindUtils.setImageMate(binding.ivPartner, email);
    }
}
