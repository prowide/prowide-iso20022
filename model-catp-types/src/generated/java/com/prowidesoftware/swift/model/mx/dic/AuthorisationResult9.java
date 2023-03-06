
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
@XmlType(name = "AuthorisationResult9", propOrder = {
    "authstnNtty",
    "authstnRspn",
    "rspnTrac",
    "authstnCd",
    "actn"
})
public class AuthorisationResult9 {

    @XmlElement(name = "AuthstnNtty")
    @XmlSchemaType(name = "string")
    protected PartyType13Code authstnNtty;
    @XmlElement(name = "AuthstnRspn", required = true)
    protected ResponseType3 authstnRspn;
    @XmlElement(name = "RspnTrac")
    protected List<ResponseType4> rspnTrac;
    @XmlElement(name = "AuthstnCd")
    protected String authstnCd;
    @XmlElement(name = "Actn")
    protected List<Action5> actn;

    /**
     * Gets the value of the authstnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType13Code }
     *     
     */
    public PartyType13Code getAuthstnNtty() {
        return authstnNtty;
    }

    /**
     * Sets the value of the authstnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType13Code }
     *     
     */
    public AuthorisationResult9 setAuthstnNtty(PartyType13Code value) {
        this.authstnNtty = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType3 }
     *     
     */
    public ResponseType3 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType3 }
     *     
     */
    public AuthorisationResult9 setAuthstnRspn(ResponseType3 value) {
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
     * {@link ResponseType4 }
     * 
     * 
     */
    public List<ResponseType4> getRspnTrac() {
        if (rspnTrac == null) {
            rspnTrac = new ArrayList<ResponseType4>();
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
    public AuthorisationResult9 setAuthstnCd(String value) {
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
     * {@link Action5 }
     * 
     * 
     */
    public List<Action5> getActn() {
        if (actn == null) {
            actn = new ArrayList<Action5>();
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
    public AuthorisationResult9 addRspnTrac(ResponseType4 rspnTrac) {
        getRspnTrac().add(rspnTrac);
        return this;
    }

    /**
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public AuthorisationResult9 addActn(Action5 actn) {
        getActn().add(actn);
        return this;
    }

}
