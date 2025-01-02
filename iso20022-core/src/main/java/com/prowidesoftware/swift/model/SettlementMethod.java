package com.prowidesoftware.swift.model;

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
    INDA("Instructed Agent"),
    INGA("Instructing Agent"),
    COVE("Cover Method"),
    CLRG("Clearing System");

    private final String description;

    // Constructor
    SettlementMethod(String description) {
        this.description = description;
    }

    public String description() {
        return description;
    }
}
