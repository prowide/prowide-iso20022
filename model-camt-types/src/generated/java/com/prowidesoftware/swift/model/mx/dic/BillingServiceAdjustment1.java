
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the billing adjustments for a specific service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingServiceAdjustment1", propOrder = {
    "tp",
    "desc",
    "amt",
    "balReqrdAmt",
    "errDt",
    "adjstmntId",
    "subSvc",
    "pricChng",
    "orgnlPric",
    "newPric",
    "volChng",
    "orgnlVol",
    "newVol",
    "orgnlChrgAmt",
    "newChrgAmt"
})
public class BillingServiceAdjustment1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceAdjustmentType1Code tp;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElement(name = "Amt", required = true)
    protected AmountAndDirection34 amt;
    @XmlElement(name = "BalReqrdAmt")
    protected AmountAndDirection34 balReqrdAmt;
    @XmlElement(name = "ErrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar errDt;
    @XmlElement(name = "AdjstmntId")
    protected String adjstmntId;
    @XmlElement(name = "SubSvc")
    protected BillingSubServiceIdentification1 subSvc;
    @XmlElement(name = "PricChng")
    protected AmountAndDirection34 pricChng;
    @XmlElement(name = "OrgnlPric")
    protected AmountAndDirection34 orgnlPric;
    @XmlElement(name = "NewPric")
    protected AmountAndDirection34 newPric;
    @XmlElement(name = "VolChng")
    protected BigDecimal volChng;
    @XmlElement(name = "OrgnlVol")
    protected BigDecimal orgnlVol;
    @XmlElement(name = "NewVol")
    protected BigDecimal newVol;
    @XmlElement(name = "OrgnlChrgAmt")
    protected AmountAndDirection34 orgnlChrgAmt;
    @XmlElement(name = "NewChrgAmt")
    protected AmountAndDirection34 newChrgAmt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAdjustmentType1Code }
     *     
     */
    public ServiceAdjustmentType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAdjustmentType1Code }
     *     
     */
    public BillingServiceAdjustment1 setTp(ServiceAdjustmentType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingServiceAdjustment1 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServiceAdjustment1 setAmt(AmountAndDirection34 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the balReqrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getBalReqrdAmt() {
        return balReqrdAmt;
    }

    /**
     * Sets the value of the balReqrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServiceAdjustment1 setBalReqrdAmt(AmountAndDirection34 value) {
        this.balReqrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the errDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getErrDt() {
        return errDt;
    }

    /**
     * Sets the value of the errDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingServiceAdjustment1 setErrDt(XMLGregorianCalendar value) {
        this.errDt = value;
        return this;
    }

    /**
     * Gets the value of the adjstmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjstmntId() {
        return adjstmntId;
    }

    /**
     * Sets the value of the adjstmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingServiceAdjustment1 setAdjstmntId(String value) {
        this.adjstmntId = value;
        return this;
    }

    /**
     * Gets the value of the subSvc property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSubServiceIdentification1 }
     *     
     */
    public BillingSubServiceIdentification1 getSubSvc() {
        return subSvc;
    }

    /**
     * Sets the value of the subSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSubServiceIdentification1 }
     *     
     */
    public BillingServiceAdjustment1 setSubSvc(BillingSubServiceIdentification1 value) {
        this.subSvc = value;
        return this;
    }

    /**
     * Gets the value of the pricChng property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getPricChng() {
        return pricChng;
    }

    /**
     * Sets the value of the pricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServiceAdjustment1 setPricChng(AmountAndDirection34 value) {
        this.pricChng = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getOrgnlPric() {
        return orgnlPric;
    }

    /**
     * Sets the value of the orgnlPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServiceAdjustment1 setOrgnlPric(AmountAndDirection34 value) {
        this.orgnlPric = value;
        return this;
    }

    /**
     * Gets the value of the newPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getNewPric() {
        return newPric;
    }

    /**
     * Sets the value of the newPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServiceAdjustment1 setNewPric(AmountAndDirection34 value) {
        this.newPric = value;
        return this;
    }

    /**
     * Gets the value of the volChng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolChng() {
        return volChng;
    }

    /**
     * Sets the value of the volChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BillingServiceAdjustment1 setVolChng(BigDecimal value) {
        this.volChng = value;
        return this;
    }

    /**
     * Gets the value of the orgnlVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgnlVol() {
        return orgnlVol;
    }

    /**
     * Sets the value of the orgnlVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BillingServiceAdjustment1 setOrgnlVol(BigDecimal value) {
        this.orgnlVol = value;
        return this;
    }

    /**
     * Gets the value of the newVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewVol() {
        return newVol;
    }

    /**
     * Sets the value of the newVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BillingServiceAdjustment1 setNewVol(BigDecimal value) {
        this.newVol = value;
        return this;
    }

    /**
     * Gets the value of the orgnlChrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getOrgnlChrgAmt() {
        return orgnlChrgAmt;
    }

    /**
     * Sets the value of the orgnlChrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServiceAdjustment1 setOrgnlChrgAmt(AmountAndDirection34 value) {
        this.orgnlChrgAmt = value;
        return this;
    }

    /**
     * Gets the value of the newChrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getNewChrgAmt() {
        return newChrgAmt;
    }

    /**
     * Sets the value of the newChrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServiceAdjustment1 setNewChrgAmt(AmountAndDirection34 value) {
        this.newChrgAmt = value;
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
