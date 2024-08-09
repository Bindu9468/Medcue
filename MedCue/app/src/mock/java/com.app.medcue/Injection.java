package com.app.medcue;

import android.content.Context;
import androidx.annotation.NonNull;

import com.app.medcue.source.MedicineRepository;
import com.app.medcue.source.local.MedicinesLocalDataSource;

public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}
