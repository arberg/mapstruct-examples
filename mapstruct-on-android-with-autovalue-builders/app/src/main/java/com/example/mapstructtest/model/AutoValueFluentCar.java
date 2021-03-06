package com.example.mapstructtest.model;

import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class AutoValueFluentCar {
    // MapStruct 1.3 does NOT work with fluent accessor style getters, hence the old-fashioned getX
    @Nullable
    public abstract String getConstructor();

    public abstract int getNumberOfSeats();

    @Nullable
    public abstract CarType getType();

    public static Builder builder() {
        return new AutoValue_AutoValueFluentCar.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder constructor(String value);

        public abstract Builder numberOfSeats(int value);

        public abstract Builder type(CarType value);

        public abstract AutoValueFluentCar build();
    }
}