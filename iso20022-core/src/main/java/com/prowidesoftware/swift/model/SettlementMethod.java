package com.prowidesoftware.swift.model;

import java.util.Arrays;
import java.util.Optional;

/**
 * Enum representing different settlement methods for financial transactions.
 *
 * <p>The settlement methods are:</p>
 * <ul>
 *   <li>{@code INDA} - Instructed Agent</li>
 *   <li>{@code INGA} - Instructing Agent</li>
 *   <li>{@code COVE} - Cover Method</li>
 *   <li>{@code CLRG} - Clearing System</li>
 * </ul>
 *
 * @since 9.5.5
 */
public enum SettlementMethod {
    INDA("INDA", "Instructed Agent"),
    INGA("INGA", "Instructing Agent"),
    COVE("COVE", "Cover Method"),
    CLRG("CLRG", "Clearing System");

    private final String label;
    private final String name;

    // Constructor
    SettlementMethod(String label, String name) {
        this.label = label;
        this.name = name;
    }

    public static Optional<SettlementMethod> findByLabel(String label) {
        return Arrays.stream(values())
                .filter(method -> method.label.equalsIgnoreCase(label))
                .findFirst();
    }

    public static Optional<SettlementMethod> findByName(String name) {
        return Arrays.stream(values())
                .filter(method -> method.name.equalsIgnoreCase(name))
                .findFirst();
    }

    // Getter for label
    public String getLabel() {
        return label;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}
