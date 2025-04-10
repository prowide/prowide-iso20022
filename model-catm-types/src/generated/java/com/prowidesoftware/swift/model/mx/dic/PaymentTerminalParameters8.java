
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
@XmlType(name = "PaymentTerminalParameters8", propOrder = {
    "actnTp",
    "vndrId",
    "vrsn",
    "paramFrmtIdr",
    "clckSynctn",
    "tmZoneLine",
    "lclDtTm",
    "othrParamsLngth",
    "offsetStart",
    "offsetEnd",
    "othrParams"
})
public class PaymentTerminalParameters8 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "VndrId")
    protected String vndrId;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "ParamFrmtIdr")
    protected String paramFrmtIdr;
    @XmlElement(name = "ClckSynctn")
    protected ClockSynchronisation3 clckSynctn;
    @XmlElement(name = "TmZoneLine")
    protected List<String> tmZoneLine;
    @XmlElement(name = "LclDtTm")
    protected List<LocalDateTime1> lclDtTm;
    @XmlElement(name = "OthrParamsLngth")
    protected BigDecimal othrParamsLngth;
    @XmlElement(name = "OffsetStart")
    protected BigDecimal offsetStart;
    @XmlElement(name = "OffsetEnd")
    protected BigDecimal offsetEnd;
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
    public PaymentTerminalParameters8 setActnTp(TerminalManagementAction3Code value) {
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
    public PaymentTerminalParameters8 setVndrId(String value) {
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
    public PaymentTerminalParameters8 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the paramFrmtIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamFrmtIdr() {
        return paramFrmtIdr;
    }

    /**
     * Sets the value of the paramFrmtIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentTerminalParameters8 setParamFrmtIdr(String value) {
        this.paramFrmtIdr = value;
        return this;
    }

    /**
     * Gets the value of the clckSynctn property.
     * 
     * @return
     *     possible object is
     *     {@link ClockSynchronisation3 }
     *     
     */
    public ClockSynchronisation3 getClckSynctn() {
        return clckSynctn;
    }

    /**
     * Sets the value of the clckSynctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClockSynchronisation3 }
     *     
     */
    public PaymentTerminalParameters8 setClckSynctn(ClockSynchronisation3 value) {
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
     * Gets the value of the othrParamsLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOthrParamsLngth() {
        return othrParamsLngth;
    }

    /**
     * Sets the value of the othrParamsLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentTerminalParameters8 setOthrParamsLngth(BigDecimal value) {
        this.othrParamsLngth = value;
        return this;
    }

    /**
     * Gets the value of the offsetStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetStart() {
        return offsetStart;
    }

    /**
     * Sets the value of the offsetStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentTerminalParameters8 setOffsetStart(BigDecimal value) {
        this.offsetStart = value;
        return this;
    }

    /**
     * Gets the value of the offsetEnd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetEnd() {
        return offsetEnd;
    }

    /**
     * Sets the value of the offsetEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentTerminalParameters8 setOffsetEnd(BigDecimal value) {
        this.offsetEnd = value;
        return this;
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
    public PaymentTerminalParameters8 setOthrParams(byte[] value) {
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
    public PaymentTerminalParameters8 addTmZoneLine(String tmZoneLine) {
        getTmZoneLine().add(tmZoneLine);
        return this;
    }

    /**
     * Adds a new item to the lclDtTm list.
     * @see #getLclDtTm()
     * 
     */
    public PaymentTerminalParameters8 addLclDtTm(LocalDateTime1 lclDtTm) {
        getLclDtTm().add(lclDtTm);
        return this;
    }

}
