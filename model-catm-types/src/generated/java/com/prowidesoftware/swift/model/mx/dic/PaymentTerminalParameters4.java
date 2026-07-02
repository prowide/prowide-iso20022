
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
 * Manufacturer configuration parameters of the point of interaction (POI).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTerminalParameters4", propOrder = {
    "actnTp",
    "vndrId",
    "vrsn",
    "clckSynctn",
    "tmZoneLine",
    "lclDtTm",
    "othrParams"
})
public class PaymentTerminalParameters4 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "VndrId")
    protected String vndrId;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "ClckSynctn")
    protected ClockSynchronisation1 clckSynctn;
    @XmlElement(name = "TmZoneLine")
    protected List<String> tmZoneLine;
    @XmlElement(name = "LclDtTm")
    protected List<LocalDateTime1> lclDtTm;
    @XmlElement(name = "OthrParams")
    protected byte[] othrParams;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public PaymentTerminalParameters4 setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
        return this;
    }

    /**
     * Gets the value of the vndrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndrId() {
        return vndrId;
    }

    /**
     * Sets the value of the vndrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTerminalParameters4 setVndrId(String value) {
        this.vndrId = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTerminalParameters4 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the clckSynctn property.
     * 
     * @return
     *     possible object is
     *     {@link ClockSynchronisation1 }
     *     
     */
    public ClockSynchronisation1 getClckSynctn() {
        return clckSynctn;
    }

    /**
     * Sets the value of the clckSynctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClockSynchronisation1 }
     *     
     */
    public PaymentTerminalParameters4 setClckSynctn(ClockSynchronisation1 value) {
        this.clckSynctn = value;
        return this;
    }

    /**
     * Gets the value of the tmZoneLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmZoneLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTmZoneLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTmZoneLine() {
        if (tmZoneLine == null) {
            tmZoneLine = new ArrayList<String>();
        }
        return this.tmZoneLine;
    }

    /**
     * Gets the value of the lclDtTm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lclDtTm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLclDtTm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalDateTime1 }
     * 
     * 
     */
    public List<LocalDateTime1> getLclDtTm() {
        if (lclDtTm == null) {
            lclDtTm = new ArrayList<LocalDateTime1>();
        }
        return this.lclDtTm;
    }

    /**
     * Gets the value of the othrParams property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOthrParams() {
        return othrParams;
    }

    /**
     * Sets the value of the othrParams property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public PaymentTerminalParameters4 setOthrParams(byte[] value) {
        this.othrParams = value;
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
     * Adds a new item to the tmZoneLine list.
     * @see #getTmZoneLine()
     * 
     */
    public PaymentTerminalParameters4 addTmZoneLine(String tmZoneLine) {
        getTmZoneLine().add(tmZoneLine);
        return this;
    }

    /**
     * Adds a new item to the lclDtTm list.
     * @see #getLclDtTm()
     * 
     */
    public PaymentTerminalParameters4 addLclDtTm(LocalDateTime1 lclDtTm) {
        getLclDtTm().add(lclDtTm);
        return this;
    }

}
