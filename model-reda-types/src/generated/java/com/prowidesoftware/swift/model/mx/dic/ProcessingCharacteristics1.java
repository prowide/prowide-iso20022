
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Processing characteristics linked to the instrument, ie, not to the market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingCharacteristics1", propOrder = {
    "amtInd",
    "unitsInd",
    "dealgCcyAccptd",
    "dealgCutOffTm",
    "dealgCutOffTmFrame",
    "sttlmCycl"
})
public class ProcessingCharacteristics1 {

    @XmlElement(name = "AmtInd")
    protected boolean amtInd;
    @XmlElement(name = "UnitsInd")
    protected boolean unitsInd;
    @XmlElement(name = "DealgCcyAccptd", required = true)
    protected List<String> dealgCcyAccptd;
    @XmlElement(name = "DealgCutOffTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime dealgCutOffTm;
    @XmlElement(name = "DealgCutOffTmFrame", required = true)
    protected TimeFrame3Choice dealgCutOffTmFrame;
    @XmlElement(name = "SttlmCycl", required = true)
    protected Timeframe2Choice sttlmCycl;

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
    public ProcessingCharacteristics1 setAmtInd(boolean value) {
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
    public ProcessingCharacteristics1 setUnitsInd(boolean value) {
        this.unitsInd = value;
        return this;
    }

    /**
     * Gets the value of the dealgCcyAccptd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dealgCcyAccptd property.
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
     * @return
     *     The value of the dealgCcyAccptd property.
     */
    public List<String> getDealgCcyAccptd() {
        if (dealgCcyAccptd == null) {
            dealgCcyAccptd = new ArrayList<>();
        }
        return this.dealgCcyAccptd;
    }

    /**
     * Gets the value of the dealgCutOffTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getDealgCutOffTm() {
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
    public ProcessingCharacteristics1 setDealgCutOffTm(OffsetTime value) {
        this.dealgCutOffTm = value;
        return this;
    }

    /**
     * Gets the value of the dealgCutOffTmFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrame3Choice }
     *     
     */
    public TimeFrame3Choice getDealgCutOffTmFrame() {
        return dealgCutOffTmFrame;
    }

    /**
     * Sets the value of the dealgCutOffTmFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrame3Choice }
     *     
     */
    public ProcessingCharacteristics1 setDealgCutOffTmFrame(TimeFrame3Choice value) {
        this.dealgCutOffTmFrame = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCycl property.
     * 
     * @return
     *     possible object is
     *     {@link Timeframe2Choice }
     *     
     */
    public Timeframe2Choice getSttlmCycl() {
        return sttlmCycl;
    }

    /**
     * Sets the value of the sttlmCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timeframe2Choice }
     *     
     */
    public ProcessingCharacteristics1 setSttlmCycl(Timeframe2Choice value) {
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
    public ProcessingCharacteristics1 addDealgCcyAccptd(String dealgCcyAccptd) {
        getDealgCcyAccptd().add(dealgCcyAccptd);
        return this;
    }

}
