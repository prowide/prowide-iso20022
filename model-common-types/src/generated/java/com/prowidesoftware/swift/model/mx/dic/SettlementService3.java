
package com.prowidesoftware.swift.model.mx.dic;

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
 * Attributes of a settlement service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementService3", propOrder = {
    "sttlmSvcPropsd",
    "sttlmSvcApld",
    "sttlmSvcDts",
    "sttlmRptgNtty",
    "addtlSttlmInf"
})
public class SettlementService3 {

    @XmlElement(name = "SttlmSvcPropsd")
    protected SettlementServiceMode1 sttlmSvcPropsd;
    @XmlElement(name = "SttlmSvcApld")
    protected SettlementServiceMode1 sttlmSvcApld;
    @XmlElement(name = "SttlmSvcDts")
    protected SettlementServiceDate2 sttlmSvcDts;
    @XmlElement(name = "SttlmRptgNtty")
    protected SettlementReportingEntity1 sttlmRptgNtty;
    @XmlElement(name = "AddtlSttlmInf")
    protected List<AdditionalData1> addtlSttlmInf;

    /**
     * Gets the value of the sttlmSvcPropsd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public SettlementServiceMode1 getSttlmSvcPropsd() {
        return sttlmSvcPropsd;
    }

    /**
     * Sets the value of the sttlmSvcPropsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public SettlementService3 setSttlmSvcPropsd(SettlementServiceMode1 value) {
        this.sttlmSvcPropsd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSvcApld property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public SettlementServiceMode1 getSttlmSvcApld() {
        return sttlmSvcApld;
    }

    /**
     * Sets the value of the sttlmSvcApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public SettlementService3 setSttlmSvcApld(SettlementServiceMode1 value) {
        this.sttlmSvcApld = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSvcDts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementServiceDate2 }
     *     
     */
    public SettlementServiceDate2 getSttlmSvcDts() {
        return sttlmSvcDts;
    }

    /**
     * Sets the value of the sttlmSvcDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementServiceDate2 }
     *     
     */
    public SettlementService3 setSttlmSvcDts(SettlementServiceDate2 value) {
        this.sttlmSvcDts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmRptgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementReportingEntity1 }
     *     
     */
    public SettlementReportingEntity1 getSttlmRptgNtty() {
        return sttlmRptgNtty;
    }

    /**
     * Sets the value of the sttlmRptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementReportingEntity1 }
     *     
     */
    public SettlementService3 setSttlmRptgNtty(SettlementReportingEntity1 value) {
        this.sttlmRptgNtty = value;
        return this;
    }

    /**
     * Gets the value of the addtlSttlmInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSttlmInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSttlmInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlSttlmInf property.
     */
    public List<AdditionalData1> getAddtlSttlmInf() {
        if (addtlSttlmInf == null) {
            addtlSttlmInf = new ArrayList<>();
        }
        return this.addtlSttlmInf;
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
     * Adds a new item to the addtlSttlmInf list.
     * @see #getAddtlSttlmInf()
     * 
     */
    public SettlementService3 addAddtlSttlmInf(AdditionalData1 addtlSttlmInf) {
        getAddtlSttlmInf().add(addtlSttlmInf);
        return this;
    }

}
