
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Processing characteristics linked to the instrument, ie, not to  the market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingCharacteristics2", propOrder = {
    "dealgCcyAccptd",
    "initlInvstmt",
    "sbsqntInvstmt",
    "amtInd",
    "unitsInd",
    "mainFndOrdrDskLctn",
    "dealgCutOffTm",
    "dealgCutOffTmFrame",
    "dealgFrqcy",
    "dealgFrqcyDesc",
    "ltdPrd",
    "sttlmCycl"
})
public class ProcessingCharacteristics2 {

    @XmlElement(name = "DealgCcyAccptd", required = true)
    protected List<String> dealgCcyAccptd;
    @XmlElement(name = "InitlInvstmt", required = true)
    protected Forms initlInvstmt;
    @XmlElement(name = "SbsqntInvstmt", required = true)
    protected Forms sbsqntInvstmt;
    @XmlElement(name = "AmtInd")
    protected boolean amtInd;
    @XmlElement(name = "UnitsInd")
    protected boolean unitsInd;
    @XmlElement(name = "MainFndOrdrDskLctn", required = true)
    protected MainFundOrderDeskLocation1 mainFndOrdrDskLctn;
    @XmlElement(name = "DealgCutOffTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dealgCutOffTm;
    @XmlElement(name = "DealgCutOffTmFrame", required = true)
    protected TimeFrame3 dealgCutOffTmFrame;
    @XmlElement(name = "DealgFrqcy", required = true)
    @XmlSchemaType(name = "string")
    protected EventFrequency5Code dealgFrqcy;
    @XmlElement(name = "DealgFrqcyDesc", required = true)
    protected String dealgFrqcyDesc;
    @XmlElement(name = "LtdPrd")
    protected String ltdPrd;
    @XmlElement(name = "SttlmCycl", required = true)
    protected TimeFrame5Choice sttlmCycl;

    /**
     * Gets the value of the dealgCcyAccptd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dealgCcyAccptd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDealgCcyAccptd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDealgCcyAccptd() {
        if (dealgCcyAccptd == null) {
            dealgCcyAccptd = new ArrayList<String>();
        }
        return this.dealgCcyAccptd;
    }

    /**
     * Gets the value of the initlInvstmt property.
     * 
     * @return
     *     possible object is
     *     {@link Forms }
     *     
     */
    public Forms getInitlInvstmt() {
        return initlInvstmt;
    }

    /**
     * Sets the value of the initlInvstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forms }
     *     
     */
    public ProcessingCharacteristics2 setInitlInvstmt(Forms value) {
        this.initlInvstmt = value;
        return this;
    }

    /**
     * Gets the value of the sbsqntInvstmt property.
     * 
     * @return
     *     possible object is
     *     {@link Forms }
     *     
     */
    public Forms getSbsqntInvstmt() {
        return sbsqntInvstmt;
    }

    /**
     * Sets the value of the sbsqntInvstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forms }
     *     
     */
    public ProcessingCharacteristics2 setSbsqntInvstmt(Forms value) {
        this.sbsqntInvstmt = value;
        return this;
    }

    /**
     * Gets the value of the amtInd property.
     * 
     */
    public boolean isAmtInd() {
        return amtInd;
    }

    /**
     * Sets the value of the amtInd property.
     * 
     */
    public ProcessingCharacteristics2 setAmtInd(boolean value) {
        this.amtInd = value;
        return this;
    }

    /**
     * Gets the value of the unitsInd property.
     * 
     */
    public boolean isUnitsInd() {
        return unitsInd;
    }

    /**
     * Sets the value of the unitsInd property.
     * 
     */
    public ProcessingCharacteristics2 setUnitsInd(boolean value) {
        this.unitsInd = value;
        return this;
    }

    /**
     * Gets the value of the mainFndOrdrDskLctn property.
     * 
     * @return
     *     possible object is
     *     {@link MainFundOrderDeskLocation1 }
     *     
     */
    public MainFundOrderDeskLocation1 getMainFndOrdrDskLctn() {
        return mainFndOrdrDskLctn;
    }

    /**
     * Sets the value of the mainFndOrdrDskLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainFundOrderDeskLocation1 }
     *     
     */
    public ProcessingCharacteristics2 setMainFndOrdrDskLctn(MainFundOrderDeskLocation1 value) {
        this.mainFndOrdrDskLctn = value;
        return this;
    }

    /**
     * Gets the value of the dealgCutOffTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDealgCutOffTm() {
        return dealgCutOffTm;
    }

    /**
     * Sets the value of the dealgCutOffTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingCharacteristics2 setDealgCutOffTm(XMLGregorianCalendar value) {
        this.dealgCutOffTm = value;
        return this;
    }

    /**
     * Gets the value of the dealgCutOffTmFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrame3 }
     *     
     */
    public TimeFrame3 getDealgCutOffTmFrame() {
        return dealgCutOffTmFrame;
    }

    /**
     * Sets the value of the dealgCutOffTmFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrame3 }
     *     
     */
    public ProcessingCharacteristics2 setDealgCutOffTmFrame(TimeFrame3 value) {
        this.dealgCutOffTmFrame = value;
        return this;
    }

    /**
     * Gets the value of the dealgFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency5Code }
     *     
     */
    public EventFrequency5Code getDealgFrqcy() {
        return dealgFrqcy;
    }

    /**
     * Sets the value of the dealgFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency5Code }
     *     
     */
    public ProcessingCharacteristics2 setDealgFrqcy(EventFrequency5Code value) {
        this.dealgFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the dealgFrqcyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealgFrqcyDesc() {
        return dealgFrqcyDesc;
    }

    /**
     * Sets the value of the dealgFrqcyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingCharacteristics2 setDealgFrqcyDesc(String value) {
        this.dealgFrqcyDesc = value;
        return this;
    }

    /**
     * Gets the value of the ltdPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtdPrd() {
        return ltdPrd;
    }

    /**
     * Sets the value of the ltdPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingCharacteristics2 setLtdPrd(String value) {
        this.ltdPrd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCycl property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrame5Choice }
     *     
     */
    public TimeFrame5Choice getSttlmCycl() {
        return sttlmCycl;
    }

    /**
     * Sets the value of the sttlmCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrame5Choice }
     *     
     */
    public ProcessingCharacteristics2 setSttlmCycl(TimeFrame5Choice value) {
        this.sttlmCycl = value;
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
     * Adds a new item to the dealgCcyAccptd list.
     * @see #getDealgCcyAccptd()
     * 
     */
    public ProcessingCharacteristics2 addDealgCcyAccptd(String dealgCcyAccptd) {
        getDealgCcyAccptd().add(dealgCcyAccptd);
        return this;
    }

}
