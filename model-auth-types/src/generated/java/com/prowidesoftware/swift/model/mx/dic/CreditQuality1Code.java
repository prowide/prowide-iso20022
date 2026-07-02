
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditQuality1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditQuality1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DFIM"/&gt;
 *     &lt;enumeration value="EXSP"/&gt;
 *     &lt;enumeration value="HIGR"/&gt;
 *     &lt;enumeration value="HISP"/&gt;
 *     &lt;enumeration value="INDF"/&gt;
 *     &lt;enumeration value="LMGR"/&gt;
 *     &lt;enumeration value="NIGS"/&gt;
 *     &lt;enumeration value="PRIM"/&gt;
 *     &lt;enumeration value="SURI"/&gt;
 *     &lt;enumeration value="UMGR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreditQuality1Code")
@XmlEnum
public enum CreditQuality1Code {


    /**
     * Credit rating that indicates a default or default-like process has begun, or the issuer is in standstill, or for a closed funding vehicle, payment capacity is irrevocably impaired.
     * 
     */
    DFIM,

    /**
     * Default of some kind appears probable.
     * 
     */
    EXSP,

    /**
     * Credit rating that denotes expectations of very low default risk. It indicates a very strong capacity for payment of financial commitments which is not significantly vulnerable to foreseeable events.
     * 
     */
    HIGR,

    /**
     * Credit rating that indicates that material default risk is present, but a limited margin of safety remains. Financial commitments are currently being met; however, capacity for continued payment is vulnerable to deterioration in the business and economic environment.
     * 
     */
    HISP,

    /**
     * Credit rating that indicates an issuer has entered into bankruptcy filings, administration, receivership, liquidation or other formal winding-up procedure or that has otherwise ceased business.
     * 
     */
    INDF,

    /**
     * Credit rating that indicates that expectations of default risk are currently low. The capacity for payment of financial commitments is considered adequate, but adverse business or economic conditions are more likely to impair this capacity.
     * 
     */
    LMGR,

    /**
     * Credit rating that indicates an elevated vulnerability to default risk, particularly in the event of adverse changes in business or economic conditions over time; however, business or financial flexibility exists that supports the servicing of financial commitments.
     * 
     */
    NIGS,

    /**
     * Credit rating that denotes the lowest expectation of default risk. Assigned only in cases of exceptionally strong capacity for payment of financial commitments. Where the capacity to meet financial commitments is highly unlikely to be adversely affected by foreseeable events.
     * 
     */
    PRIM,

    /**
     * Default is a real possibility.
     * 
     */
    SURI,

    /**
     * Credit rating that denotes expectations of low default risk. The capacity for payment of financial commitments is considered strong. This capacity may, nevertheless, be more vulnerable to adverse business or economic conditions than is the case for higher ratings.
     * 
     */
    UMGR;

    public String value() {
        return name();
    }

    public static CreditQuality1Code fromValue(String v) {
        return valueOf(v);
    }

}
