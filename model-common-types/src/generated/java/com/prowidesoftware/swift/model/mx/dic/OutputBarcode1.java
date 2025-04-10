
package com.prowidesoftware.swift.model.mx.dic;

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
 * Barcode content to display or print.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputBarcode1", propOrder = {
    "brcdTp",
    "brcdVal",
    "qrCdBinryVal",
    "qrCdVrsn",
    "qrCdNcodgMd",
    "qrCdErrCrrctn"
})
public class OutputBarcode1 {

    @XmlElement(name = "BrcdTp", required = true)
    @XmlSchemaType(name = "string")
    protected BarcodeType1Code brcdTp;
    @XmlElement(name = "BrcdVal")
    protected String brcdVal;
    @XmlElement(name = "QRCdBinryVal")
    protected byte[] qrCdBinryVal;
    @XmlElement(name = "QRCdVrsn")
    protected String qrCdVrsn;
    @XmlElement(name = "QRCdNcodgMd", required = true)
    @XmlSchemaType(name = "string")
    protected QRCodeEncodingMode1Code qrCdNcodgMd;
    @XmlElement(name = "QRCdErrCrrctn")
    @XmlSchemaType(name = "string")
    protected QRCodeErrorCorrection1Code qrCdErrCrrctn;

    /**
     * Gets the value of the brcdTp property.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeType1Code }
     *     
     */
    public BarcodeType1Code getBrcdTp() {
        return brcdTp;
    }

    /**
     * Sets the value of the brcdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeType1Code }
     *     
     */
    public OutputBarcode1 setBrcdTp(BarcodeType1Code value) {
        this.brcdTp = value;
        return this;
    }

    /**
     * Gets the value of the brcdVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrcdVal() {
        return brcdVal;
    }

    /**
     * Sets the value of the brcdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputBarcode1 setBrcdVal(String value) {
        this.brcdVal = value;
        return this;
    }

    /**
     * Gets the value of the qrCdBinryVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getQRCdBinryVal() {
        return qrCdBinryVal;
    }

    /**
     * Sets the value of the qrCdBinryVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public OutputBarcode1 setQRCdBinryVal(byte[] value) {
        this.qrCdBinryVal = value;
        return this;
    }

    /**
     * Gets the value of the qrCdVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQRCdVrsn() {
        return qrCdVrsn;
    }

    /**
     * Sets the value of the qrCdVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputBarcode1 setQRCdVrsn(String value) {
        this.qrCdVrsn = value;
        return this;
    }

    /**
     * Gets the value of the qrCdNcodgMd property.
     * 
     * @return
     *     possible object is
     *     {@link QRCodeEncodingMode1Code }
     *     
     */
    public QRCodeEncodingMode1Code getQRCdNcodgMd() {
        return qrCdNcodgMd;
    }

    /**
     * Sets the value of the qrCdNcodgMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRCodeEncodingMode1Code }
     *     
     */
    public OutputBarcode1 setQRCdNcodgMd(QRCodeEncodingMode1Code value) {
        this.qrCdNcodgMd = value;
        return this;
    }

    /**
     * Gets the value of the qrCdErrCrrctn property.
     * 
     * @return
     *     possible object is
     *     {@link QRCodeErrorCorrection1Code }
     *     
     */
    public QRCodeErrorCorrection1Code getQRCdErrCrrctn() {
        return qrCdErrCrrctn;
    }

    /**
     * Sets the value of the qrCdErrCrrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRCodeErrorCorrection1Code }
     *     
     */
    public OutputBarcode1 setQRCdErrCrrctn(QRCodeErrorCorrection1Code value) {
        this.qrCdErrCrrctn = value;
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
