
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Data to be verified.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationValue1", propOrder = {
    "nm",
    "txtVal",
    "binryVal",
    "hexBinryVal",
    "dtTm",
    "vldtyEndDt",
    "vldtyEndTm"
})
public class VerificationValue1 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "TxtVal")
    protected String txtVal;
    @XmlElement(name = "BinryVal")
    protected byte[] binryVal;
    @XmlElement(name = "HexBinryVal")
    protected String hexBinryVal;
    @XmlElement(name = "DtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dtTm;
    @XmlElement(name = "VldtyEndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate vldtyEndDt;
    @XmlElement(name = "VldtyEndTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime vldtyEndTm;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VerificationValue1 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the txtVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtVal() {
        return txtVal;
    }

    /**
     * Sets the value of the txtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VerificationValue1 setTxtVal(String value) {
        this.txtVal = value;
        return this;
    }

    /**
     * Gets the value of the binryVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinryVal() {
        return binryVal;
    }

    /**
     * Sets the value of the binryVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public VerificationValue1 setBinryVal(byte[] value) {
        this.binryVal = value;
        return this;
    }

    /**
     * Gets the value of the hexBinryVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHexBinryVal() {
        return hexBinryVal;
    }

    /**
     * Sets the value of the hexBinryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VerificationValue1 setHexBinryVal(String value) {
        this.hexBinryVal = value;
        return this;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VerificationValue1 setDtTm(OffsetDateTime value) {
        this.dtTm = value;
        return this;
    }

    /**
     * Gets the value of the vldtyEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getVldtyEndDt() {
        return vldtyEndDt;
    }

    /**
     * Sets the value of the vldtyEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VerificationValue1 setVldtyEndDt(LocalDate value) {
        this.vldtyEndDt = value;
        return this;
    }

    /**
     * Gets the value of the vldtyEndTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getVldtyEndTm() {
        return vldtyEndTm;
    }

    /**
     * Sets the value of the vldtyEndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VerificationValue1 setVldtyEndTm(OffsetTime value) {
        this.vldtyEndTm = value;
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
