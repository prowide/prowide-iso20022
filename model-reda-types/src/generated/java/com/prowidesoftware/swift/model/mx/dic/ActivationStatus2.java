
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
 * Specifies the status of a debtor activation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationStatus2", propOrder = {
    "orgnlBizInstr",
    "sts",
    "stsRsn",
    "orgnlActvtnRef",
    "fctvActvtnDt",
    "splmtryData"
})
public class ActivationStatus2 {

    @XmlElement(name = "OrgnlBizInstr")
    protected OriginalBusinessInstruction1 orgnlBizInstr;
    @XmlElement(name = "Sts", required = true)
    protected ServiceStatus1Choice sts;
    @XmlElement(name = "StsRsn")
    protected DebtorActivationStatusReason2 stsRsn;
    @XmlElement(name = "OrgnlActvtnRef")
    protected OriginalActivation2Choice orgnlActvtnRef;
    @XmlElement(name = "FctvActvtnDt")
    protected DateAndDateTime2Choice fctvActvtnDt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the orgnlBizInstr property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalBusinessInstruction1 }
     *     
     */
    public OriginalBusinessInstruction1 getOrgnlBizInstr() {
        return orgnlBizInstr;
    }

    /**
     * Sets the value of the orgnlBizInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessInstruction1 }
     *     
     */
    public ActivationStatus2 setOrgnlBizInstr(OriginalBusinessInstruction1 value) {
        this.orgnlBizInstr = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus1Choice }
     *     
     */
    public ServiceStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus1Choice }
     *     
     */
    public ActivationStatus2 setSts(ServiceStatus1Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorActivationStatusReason2 }
     *     
     */
    public DebtorActivationStatusReason2 getStsRsn() {
        return stsRsn;
    }

    /**
     * Sets the value of the stsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorActivationStatusReason2 }
     *     
     */
    public ActivationStatus2 setStsRsn(DebtorActivationStatusReason2 value) {
        this.stsRsn = value;
        return this;
    }

    /**
     * Gets the value of the orgnlActvtnRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalActivation2Choice }
     *     
     */
    public OriginalActivation2Choice getOrgnlActvtnRef() {
        return orgnlActvtnRef;
    }

    /**
     * Sets the value of the orgnlActvtnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalActivation2Choice }
     *     
     */
    public ActivationStatus2 setOrgnlActvtnRef(OriginalActivation2Choice value) {
        this.orgnlActvtnRef = value;
        return this;
    }

    /**
     * Gets the value of the fctvActvtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getFctvActvtnDt() {
        return fctvActvtnDt;
    }

    /**
     * Sets the value of the fctvActvtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public ActivationStatus2 setFctvActvtnDt(DateAndDateTime2Choice value) {
        this.fctvActvtnDt = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ActivationStatus2 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
