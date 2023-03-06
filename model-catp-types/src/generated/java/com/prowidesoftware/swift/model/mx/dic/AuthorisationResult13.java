
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Outcome of the withdrawal authorisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorisationResult13", propOrder = {
    "authstnNtty",
    "authstnRspn",
    "rspnTrac",
    "authstnCd",
    "actn"
})
public class AuthorisationResult13 {

    @XmlElement(name = "AuthstnNtty")
    @XmlSchemaType(name = "string")
    protected PartyType16Code authstnNtty;
    @XmlElement(name = "AuthstnRspn", required = true)
    protected ResponseType7 authstnRspn;
    @XmlElement(name = "RspnTrac")
    protected List<ResponseType8> rspnTrac;
    @XmlElement(name = "AuthstnCd")
    protected String authstnCd;
    @XmlElement(name = "Actn")
    protected List<Action7> actn;

    /**
     * Gets the value of the authstnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType16Code }
     *     
     */
    public PartyType16Code getAuthstnNtty() {
        return authstnNtty;
    }

    /**
     * Sets the value of the authstnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType16Code }
     *     
     */
    public AuthorisationResult13 setAuthstnNtty(PartyType16Code value) {
        this.authstnNtty = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType7 }
     *     
     */
    public ResponseType7 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType7 }
     *     
     */
    public AuthorisationResult13 setAuthstnRspn(ResponseType7 value) {
        this.authstnRspn = value;
        return this;
    }

    /**
     * Gets the value of the rspnTrac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rspnTrac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspnTrac().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseType8 }
     * 
     * 
     */
    public List<ResponseType8> getRspnTrac() {
        if (rspnTrac == null) {
            rspnTrac = new ArrayList<ResponseType8>();
        }
        return this.rspnTrac;
    }

    /**
     * Gets the value of the authstnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnCd() {
        return authstnCd;
    }

    /**
     * Sets the value of the authstnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuthorisationResult13 setAuthstnCd(String value) {
        this.authstnCd = value;
        return this;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action7 }
     * 
     * 
     */
    public List<Action7> getActn() {
        if (actn == null) {
            actn = new ArrayList<Action7>();
        }
        return this.actn;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the rspnTrac list.
     * @see #getRspnTrac()
     * 
     */
    public AuthorisationResult13 addRspnTrac(ResponseType8 rspnTrac) {
        getRspnTrac().add(rspnTrac);
        return this;
    }

    /**
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public AuthorisationResult13 addActn(Action7 actn) {
        getActn().add(actn);
        return this;
    }

}
