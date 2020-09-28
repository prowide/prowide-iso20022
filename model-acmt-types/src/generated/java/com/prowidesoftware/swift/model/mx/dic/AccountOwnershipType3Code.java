
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountOwnershipType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountOwnershipType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JOIN"/&gt;
 *     &lt;enumeration value="COMO"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="SIGL"/&gt;
 *     &lt;enumeration value="JOIT"/&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="TRUS"/&gt;
 *     &lt;enumeration value="NOMI"/&gt;
 *     &lt;enumeration value="NFPO"/&gt;
 *     &lt;enumeration value="ONIS"/&gt;
 *     &lt;enumeration value="EURE"/&gt;
 *     &lt;enumeration value="GOVO"/&gt;
 *     &lt;enumeration value="LLCO"/&gt;
 *     &lt;enumeration value="RGIC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountOwnershipType3Code")
@XmlEnum
public enum AccountOwnershipType3Code {


    /**
     * Two or more individuals own shares of the same account. Upon the death of one of the account owners, the entire account ownership is passed onto the surviving owners.
     * 
     */
    JOIN,

    /**
     * Two or more individuals of legal age own shares of the same account. Upon the death of one of the account owners, the respective percentage of the ownership is transferred to the deceased's estate.
     * 
     */
    COMO,

    /**
     * Minor's account, registered in the minor's name. Since the minor cannot legally own property,  the custodian of the account maintains control of the account.
     * 
     */
    CUST,

    /**
     * Account has only one individual owner.
     * 
     */
    SIGL,

    /**
     * Two or more individuals of legal age own shares of the same account.
     * 
     */
    JOIT,

    /**
     * Account owner is a corporate.
     * 
     */
    CORP,

    /**
     * Account owner is a contractual business organisation in which two or more individuals agree to pool their funds to manage and operate a business.
     * 
     */
    PART,

    /**
     * Account owner is an organisation which is engaged as a trustee for individuals or businesses in the administration of services such as stock transfer, registration, trust funds.
     * 
     */
    TRUS,

    /**
     * Account owner is a person or firm into whose name securities or other properties are transferred in order to facilitate transactions whilst leaving the customer as the actual owner.
     * 
     */
    NOMI,

    /**
     * Account owner is an association that is given tax-free status due to the nature of their activities such as charity organisation.
     * 
     */
    NFPO,

    /**
     * Account owner is an other type of non individual organisation.
     * 
     */
    ONIS,

    /**
     * Account owner is an entity located in the European Union which can be considered neither as a legal entity (eg. company, corporate), nor as an individual person, nor as a UCITS (Undertakings for Collective Investment of Transferable Securities) fund.
     * 
     */
    EURE,

    /**
     * Account owner is a governemental organisation.
     * 
     */
    GOVO,

    /**
     * Account is for a limited liability company.
     * 
     */
    LLCO,

    /**
     * Account is for a registered investment company.
     * 
     */
    RGIC;

    public String value() {
        return name();
    }

    public static AccountOwnershipType3Code fromValue(String v) {
        return valueOf(v);
    }

}
