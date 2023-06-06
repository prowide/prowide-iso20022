
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountOwnershipType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountOwnershipType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOWN"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="ENTR"/>
 *     <enumeration value="EURE"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="TRUS"/>
 *     <enumeration value="GOVO"/>
 *     <enumeration value="JOIT"/>
 *     <enumeration value="COMO"/>
 *     <enumeration value="JOIN"/>
 *     <enumeration value="LLCO"/>
 *     <enumeration value="LIPA"/>
 *     <enumeration value="NOMI"/>
 *     <enumeration value="NFPO"/>
 *     <enumeration value="ONIS"/>
 *     <enumeration value="OWNR"/>
 *     <enumeration value="RGIC"/>
 *     <enumeration value="SIGL"/>
 *     <enumeration value="UNCO"/>
 *     <enumeration value="USUF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountOwnershipType6Code")
@XmlEnum
public enum AccountOwnershipType6Code {


    /**
     * A person has bare ownership on the asset.
     * 
     */
    BOWN,

    /**
     * Account owner is a corporate.
     * 
     */
    CORP,

    /**
     * Minor's account, registered in the minor's name. Since the minor cannot legally own property, the custodian of the account maintains control of the account.
     * 
     */
    CUST,

    /**
     * Entrepreneurial account.
     * 
     */
    ENTR,

    /**
     * Account owner is an entity located in the European Union which can be considered neither as a legal entity (for example, company, corporate), nor as an individual person, nor as a UCITS (Undertakings for Collective Investment of Transferable Securities) fund.
     * 
     */
    EURE,

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
     * Account owner is a government organisation.
     * 
     */
    GOVO,

    /**
     * Two or more individuals of legal age own shares of the same account.
     * 
     */
    JOIT,

    /**
     * Two or more individuals of legal age own shares of the same account. Upon the death of one of the account owners, the respective percentage of the ownership is transferred to the deceased's estate.
     * 
     */
    COMO,

    /**
     * Two or more individuals own shares of the same account. Upon the death of one of the account owners, the entire account ownership is passed onto the surviving owners.
     * 
     */
    JOIN,

    /**
     * Account is for a limited liability company.
     * 
     */
    LLCO,

    /**
     * Account owner is a limited partnership or is of sole proprietorship.
     * 
     */
    LIPA,

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
     * Account owner is another type of non individual organisation.
     * 
     */
    ONIS,

    /**
     * A person has full ownership on the asset. 
     * 
     */
    OWNR,

    /**
     * Account is for a registered investment company.
     * 
     */
    RGIC,

    /**
     * Account has only one individual owner.
     * 
     */
    SIGL,

    /**
     * Account owner is an unincorporated partnership or is of sole proprietorship.
     * 
     */
    UNCO,

    /**
     * The person is ...
     * 
     */
    USUF;

    public String value() {
        return name();
    }

    public static AccountOwnershipType6Code fromValue(String v) {
        return valueOf(v);
    }

}
