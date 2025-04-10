
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Outcome of the authorisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorisationResult7", propOrder = {
    "authstnNtty",
    "txRspn",
    "authstnCd",
    "addtlInf"
})
public class AuthorisationResult7 {

    @XmlElement(name = "AuthstnNtty")
    protected GenericIdentification75 authstnNtty;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType2 txRspn;
    @XmlElement(name = "AuthstnCd")
    protected String authstnCd;
    @XmlElement(name = "AddtlInf")
    protected List<ActionMessage3> addtlInf;

    /**
     * Gets the value of the authstnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification75 }
     *     
     */
    public GenericIdentification75 getAuthstnNtty() {
        return authstnNtty;
    }

    /**
     * Sets the value of the authstnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification75 }
     *     
     */
    public AuthorisationResult7 setAuthstnNtty(GenericIdentification75 value) {
        this.authstnNtty = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType2 }
     *     
     */
    public ResponseType2 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType2 }
     *     
     */
    public AuthorisationResult7 setTxRspn(ResponseType2 value) {
        this.txRspn = value;
        return this;
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
    public AuthorisationResult7 setAuthstnCd(String value) {
        this.authstnCd = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionMessage3 }
     * 
     * 
     */
    public List<ActionMessage3> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<ActionMessage3>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public AuthorisationResult7 addAddtlInf(ActionMessage3 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
