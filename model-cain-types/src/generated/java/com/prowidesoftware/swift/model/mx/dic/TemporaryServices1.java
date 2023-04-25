
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information regarding the billing for services rendered on a temporary or contract basis. The component provides information such as the employee job performed, timekeeping, and billing rates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporaryServices1", propOrder = {
    "ctrctgCpny",
    "tempMplyee",
    "job",
    "flatRateInd",
    "dscntAmt",
    "summryCmmdtyId",
    "labr",
    "miscExpnss",
    "sbttlAmt",
    "tax",
    "addtlData"
})
public class TemporaryServices1 {

    @XmlElement(name = "CtrctgCpny")
    protected TemporaryServicesCompany1 ctrctgCpny;
    @XmlElement(name = "TempMplyee")
    protected PartyIdentification210 tempMplyee;
    @XmlElement(name = "Job")
    protected TemporaryServicesJob1 job;
    @XmlElement(name = "FlatRateInd")
    protected Boolean flatRateInd;
    @XmlElement(name = "DscntAmt")
    protected BigDecimal dscntAmt;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "Labr")
    protected TemporaryServicesLabor1 labr;
    @XmlElement(name = "MiscExpnss")
    protected List<Amount13> miscExpnss;
    @XmlElement(name = "SbttlAmt")
    protected BigDecimal sbttlAmt;
    @XmlElement(name = "Tax")
    protected List<Tax33> tax;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the ctrctgCpny property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryServicesCompany1 }
     *     
     */
    public TemporaryServicesCompany1 getCtrctgCpny() {
        return ctrctgCpny;
    }

    /**
     * Sets the value of the ctrctgCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryServicesCompany1 }
     *     
     */
    public TemporaryServices1 setCtrctgCpny(TemporaryServicesCompany1 value) {
        this.ctrctgCpny = value;
        return this;
    }

    /**
     * Gets the value of the tempMplyee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification210 }
     *     
     */
    public PartyIdentification210 getTempMplyee() {
        return tempMplyee;
    }

    /**
     * Sets the value of the tempMplyee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification210 }
     *     
     */
    public TemporaryServices1 setTempMplyee(PartyIdentification210 value) {
        this.tempMplyee = value;
        return this;
    }

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryServicesJob1 }
     *     
     */
    public TemporaryServicesJob1 getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryServicesJob1 }
     *     
     */
    public TemporaryServices1 setJob(TemporaryServicesJob1 value) {
        this.job = value;
        return this;
    }

    /**
     * Gets the value of the flatRateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlatRateInd() {
        return flatRateInd;
    }

    /**
     * Sets the value of the flatRateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TemporaryServices1 setFlatRateInd(Boolean value) {
        this.flatRateInd = value;
        return this;
    }

    /**
     * Gets the value of the dscntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscntAmt() {
        return dscntAmt;
    }

    /**
     * Sets the value of the dscntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TemporaryServices1 setDscntAmt(BigDecimal value) {
        this.dscntAmt = value;
        return this;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices1 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the labr property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryServicesLabor1 }
     *     
     */
    public TemporaryServicesLabor1 getLabr() {
        return labr;
    }

    /**
     * Sets the value of the labr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryServicesLabor1 }
     *     
     */
    public TemporaryServices1 setLabr(TemporaryServicesLabor1 value) {
        this.labr = value;
        return this;
    }

    /**
     * Gets the value of the miscExpnss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the miscExpnss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscExpnss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount13 }
     * 
     * 
     * @return
     *     The value of the miscExpnss property.
     */
    public List<Amount13> getMiscExpnss() {
        if (miscExpnss == null) {
            miscExpnss = new ArrayList<>();
        }
        return this.miscExpnss;
    }

    /**
     * Gets the value of the sbttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSbttlAmt() {
        return sbttlAmt;
    }

    /**
     * Sets the value of the sbttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TemporaryServices1 setSbttlAmt(BigDecimal value) {
        this.sbttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax33 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax33> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServices1 setAddtlData(String value) {
        this.addtlData = value;
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

    /**
     * Adds a new item to the miscExpnss list.
     * @see #getMiscExpnss()
     * 
     */
    public TemporaryServices1 addMiscExpnss(Amount13 miscExpnss) {
        getMiscExpnss().add(miscExpnss);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public TemporaryServices1 addTax(Tax33 tax) {
        getTax().add(tax);
        return this;
    }

}
