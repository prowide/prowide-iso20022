
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlement1", propOrder = {
    "ccy",
    "dt",
    "dtCd",
    "plcOfSttlm",
    "sfkpgAcctDtls"
})
public class SecuritiesSettlement1 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "DtCd")
    protected DateType1Choice dtCd;
    @XmlElement(name = "PlcOfSttlm")
    protected PartyIdentification23 plcOfSttlm;
    @XmlElement(name = "SfkpgAcctDtls")
    protected SecuritiesAccount2 sfkpgAcctDtls;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesSettlement1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SecuritiesSettlement1 setDt(XMLGregorianCalendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the dtCd property.
     * 
     * @return
     *     possible object is
     *     {@link DateType1Choice }
     *     
     */
    public DateType1Choice getDtCd() {
        return dtCd;
    }

    /**
     * Sets the value of the dtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType1Choice }
     *     
     */
    public SecuritiesSettlement1 setDtCd(DateType1Choice value) {
        this.dtCd = value;
        return this;
    }

    /**
     * Gets the value of the plcOfSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification23 }
     *     
     */
    public PartyIdentification23 getPlcOfSttlm() {
        return plcOfSttlm;
    }

    /**
     * Sets the value of the plcOfSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification23 }
     *     
     */
    public SecuritiesSettlement1 setPlcOfSttlm(PartyIdentification23 value) {
        this.plcOfSttlm = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount2 }
     *     
     */
    public SecuritiesAccount2 getSfkpgAcctDtls() {
        return sfkpgAcctDtls;
    }

    /**
     * Sets the value of the sfkpgAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount2 }
     *     
     */
    public SecuritiesSettlement1 setSfkpgAcctDtls(SecuritiesAccount2 value) {
        this.sfkpgAcctDtls = value;
        return this;
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

}
