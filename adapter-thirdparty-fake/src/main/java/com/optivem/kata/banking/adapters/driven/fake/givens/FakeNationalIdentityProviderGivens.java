package com.optivem.kata.banking.adapters.driven.fake.givens;

import com.optivem.kata.banking.adapters.driven.fake.FakeNationalIdentityProvider;

import java.util.Collection;

public class FakeNationalIdentityProviderGivens {
    public static FakeNationalIdentityProviderGiven givenThat(FakeNationalIdentityProvider provider) {
        return new FakeNationalIdentityProviderGiven(provider);
    }
}
