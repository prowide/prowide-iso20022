
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Information about units to transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Unit12", propOrder = {
    "unitsNb",
    "ordrDt",
    "acqstnDt",
    "certNb",
    "grp1Or2Units",
    "ref",
    "pricDtls",
    "txOvrhd",
    "othrAmt"
})
public class Unit12 {

    @XmlElement(name = "UnitsNb", required = true)
    protected BigDecimal unitsNb;
    @XmlElement(name = "OrdrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ordrDt;
    @XmlElement(name = "AcqstnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acqstnDt;
    @XmlElement(name = "CertNb")
    protected List<String> certNb;
    @XmlElement(name = "Grp1Or2Units")
    @XmlSchemaType(name = "string")
    protected UKTaxGroupUnit1Code grp1Or2Units;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "PricDtls")
    protected UnitPrice23 pricDtls;
    @XmlElement(name = "TxOvrhd")
    protected TotalFeesAndTaxes42 txOvrhd;
    @XmlElement(name = "OthrAmt")
    protected List<OtherAmount1> othrAmt;

    /**
     * Gets the value of the unitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitsNb() {
        return unitsNb;
    }

    /**
     * Sets the value of the unitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Unit12 setUnitsNb(BigDecimal value) {
        this.unitsNb = value;
        return this;
    }

    /**
     * Gets the value of the ordrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getOrdrDt() {
        return ordrDt;
    }

    /**
     * Sets the value of the ordrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Unit12 setOrdrDt(XMLGregorianCalendar value) {
        this.ordrDt = value;
        return this;
    }

    /**
     * Gets the value of the acqstnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getAcqstnDt() {
        return acqstnDt;
    }

    /**
     * Sets the value of the acqstnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Unit12 setAcqstnDt(XMLGregorianCalendar value) {
        this.acqstnDt = value;
        return this;
    }

    /**
     * Gets the value of the certNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCertNb() {
        if (certNb == null) {
            certNb = new ArrayList<String>();
        }
        return this.certNb;
    }

    /**
     * Gets the value of the grp1Or2Units property.
     * 
     * @return
     *     possible object is
     *     {@link UKTaxGroupUnit1Code }
     *     
     */
    public UKTaxGroupUnit1Code getGrp1Or2Units() {
        return grp1Or2Units;
    }

    /**
     * Sets the value of the grp1Or2Units property.
     * 
     * @param value
     *     allowed object is
     *     {@link UKTaxGroupUnit1Code }
     *     
     */
    public Unit12 setGrp1Or2Units(UKTaxGroupUnit1Code value) {
        this.grp1Or2Units = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Unit12 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice23 }
     *     
     */
    public UnitPrice23 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice23 }
     *     
     */
    public Unit12 setPricDtls(UnitPrice23 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the txOvrhd property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFeesAndTaxes42 }
     *     
     */
    public TotalFeesAndTaxes42 getTxOvrhd() {
        return txOvrhd;
    }

    /**
     * Sets the value of the txOvrhd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFeesAndTaxes42 }
     *     
     */
    public Unit12 setTxOvrhd(TotalFeesAndTaxes42 value) {
        this.txOvrhd = value;
        return this;
    }

    /**
     * Gets the value of the othrAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmount1 }
     * 
     * 
     */
    public List<OtherAmount1> getOthrAmt() {
        if (othrAmt == null) {
            othrAmt = new ArrayList<OtherAmount1>();
        }
        return this.othrAmt;
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
     * Adds a new item to the certNb list.
     * @see #getCertNb()
     * 
     */
    public Unit12 addCertNb(String certNb) {
        getCertNb().add(certNb);
        return this;
    }

    /**
     * Adds a new item to the othrAmt list.
     * @see #getOthrAmt()
     * 
     */
    public Unit12 addOthrAmt(OtherAmount1 othrAmt) {
        getOthrAmt().add(othrAmt);
        return this;
    }

}
