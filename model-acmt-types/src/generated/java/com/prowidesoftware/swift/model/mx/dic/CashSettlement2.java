
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Cash settlement parties and accounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashSettlement2", propOrder = {
    "modScpIndctn",
    "cshAcctDtls",
    "othrCshSttlmDtls"
})
public class CashSettlement2 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification2Code modScpIndctn;
    @XmlElement(name = "CshAcctDtls")
    protected List<CashAccount33> cshAcctDtls;
    @XmlElement(name = "OthrCshSttlmDtls")
    protected List<PaymentInstrument13> othrCshSttlmDtls;

    /**
     * Gets the value of the modScpIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link DataModification2Code }
     *     
     */
    public DataModification2Code getModScpIndctn() {
        return modScpIndctn;
    }

    /**
     * Sets the value of the modScpIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataModification2Code }
     *     
     */
    public CashSettlement2 setModScpIndctn(DataModification2Code value) {
        this.modScpIndctn = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshAcctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount33 }
     * 
     * 
     */
    public List<CashAccount33> getCshAcctDtls() {
        if (cshAcctDtls == null) {
            cshAcctDtls = new ArrayList<CashAccount33>();
        }
        return this.cshAcctDtls;
    }

    /**
     * Gets the value of the othrCshSttlmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrCshSttlmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrCshSttlmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstrument13 }
     * 
     * 
     */
    public List<PaymentInstrument13> getOthrCshSttlmDtls() {
        if (othrCshSttlmDtls == null) {
            othrCshSttlmDtls = new ArrayList<PaymentInstrument13>();
        }
        return this.othrCshSttlmDtls;
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
     * Adds a new item to the cshAcctDtls list.
     * @see #getCshAcctDtls()
     * 
     */
    public CashSettlement2 addCshAcctDtls(CashAccount33 cshAcctDtls) {
        getCshAcctDtls().add(cshAcctDtls);
        return this;
    }

    /**
     * Adds a new item to the othrCshSttlmDtls list.
     * @see #getOthrCshSttlmDtls()
     * 
     */
    public CashSettlement2 addOthrCshSttlmDtls(PaymentInstrument13 othrCshSttlmDtls) {
        getOthrCshSttlmDtls().add(othrCshSttlmDtls);
        return this;
    }

}
