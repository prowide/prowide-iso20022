
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
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details about tax paid, or to be paid, to the government in accordance with the law, including pre-defined parameters such as thresholds and type of account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInformation2", propOrder = {
    "cdtrTaxId",
    "cdtrTaxTp",
    "dbtrTaxId",
    "taxRefNb",
    "ttlTaxblBaseAmt",
    "ttlTaxAmt",
    "taxDt",
    "taxTpInf"
})
public class TaxInformation2 {

    @XmlElement(name = "CdtrTaxId")
    protected String cdtrTaxId;
    @XmlElement(name = "CdtrTaxTp")
    protected String cdtrTaxTp;
    @XmlElement(name = "DbtrTaxId")
    protected String dbtrTaxId;
    @XmlElement(name = "TaxRefNb")
    protected String taxRefNb;
    @XmlElement(name = "TtlTaxblBaseAmt")
    protected CurrencyAndAmount ttlTaxblBaseAmt;
    @XmlElement(name = "TtlTaxAmt")
    protected CurrencyAndAmount ttlTaxAmt;
    @XmlElement(name = "TaxDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDt;
    @XmlElement(name = "TaxTpInf")
    protected List<TaxDetails> taxTpInf;

    /**
     * Gets the value of the cdtrTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrTaxId() {
        return cdtrTaxId;
    }

    /**
     * Sets the value of the cdtrTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxInformation2 setCdtrTaxId(String value) {
        this.cdtrTaxId = value;
        return this;
    }

    /**
     * Gets the value of the cdtrTaxTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrTaxTp() {
        return cdtrTaxTp;
    }

    /**
     * Sets the value of the cdtrTaxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxInformation2 setCdtrTaxTp(String value) {
        this.cdtrTaxTp = value;
        return this;
    }

    /**
     * Gets the value of the dbtrTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrTaxId() {
        return dbtrTaxId;
    }

    /**
     * Sets the value of the dbtrTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxInformation2 setDbtrTaxId(String value) {
        this.dbtrTaxId = value;
        return this;
    }

    /**
     * Gets the value of the taxRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRefNb() {
        return taxRefNb;
    }

    /**
     * Sets the value of the taxRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxInformation2 setTaxRefNb(String value) {
        this.taxRefNb = value;
        return this;
    }

    /**
     * Gets the value of the ttlTaxblBaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlTaxblBaseAmt() {
        return ttlTaxblBaseAmt;
    }

    /**
     * Sets the value of the ttlTaxblBaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public TaxInformation2 setTtlTaxblBaseAmt(CurrencyAndAmount value) {
        this.ttlTaxblBaseAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlTaxAmt() {
        return ttlTaxAmt;
    }

    /**
     * Sets the value of the ttlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public TaxInformation2 setTtlTaxAmt(CurrencyAndAmount value) {
        this.ttlTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTaxDt() {
        return taxDt;
    }

    /**
     * Sets the value of the taxDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxInformation2 setTaxDt(XMLGregorianCalendar value) {
        this.taxDt = value;
        return this;
    }

    /**
     * Gets the value of the taxTpInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTpInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTpInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetails }
     * 
     * 
     */
    public List<TaxDetails> getTaxTpInf() {
        if (taxTpInf == null) {
            taxTpInf = new ArrayList<TaxDetails>();
        }
        return this.taxTpInf;
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
     * Adds a new item to the taxTpInf list.
     * @see #getTaxTpInf()
     * 
     */
    public TaxInformation2 addTaxTpInf(TaxDetails taxTpInf) {
        getTaxTpInf().add(taxTpInf);
        return this;
    }

}
