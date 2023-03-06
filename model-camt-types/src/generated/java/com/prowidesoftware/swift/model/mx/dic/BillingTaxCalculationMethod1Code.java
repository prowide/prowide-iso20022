
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingTaxCalculationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingTaxCalculationMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NTAX"/&gt;
 *     &lt;enumeration value="MTDA"/&gt;
 *     &lt;enumeration value="MTDB"/&gt;
 *     &lt;enumeration value="MTDC"/&gt;
 *     &lt;enumeration value="MTDD"/&gt;
 *     &lt;enumeration value="UDFD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillingTaxCalculationMethod1Code")
@XmlEnum
public enum BillingTaxCalculationMethod1Code {


    /**
     * No taxes are calculated or due on this account.
     * 
     */
    NTAX,

    /**
     * Line-by-line per service calculation and settlement currency translation.
     * 
     */
    MTDA,

    /**
     * Line-by-line per service calculation with settlement currency translation performed on the statement tax total.
     * 
     */
    MTDB,

    /**
     * Group tax calculation with group settlement currency translation.
     * 
     */
    MTDC,

    /**
     * Line-by-line per service calculation with all charges and taxes due in the pricing currency.
     * 
     */
    MTDD,

    /**
     * Tax calculation method is not defined or unknown.
     * 
     */
    UDFD;

    public String value() {
        return name();
    }

    public static BillingTaxCalculationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
