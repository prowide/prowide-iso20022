
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
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Collection of data for that is exchanged between two or more parties in written, printed or electronic form.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceHeader2", propOrder = {
    "id",
    "tpCd",
    "nm",
    "isseDtTm",
    "issr",
    "langCd",
    "cpyInd",
    "docPurp",
    "inclNote"
})
public class InvoiceHeader2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "TpCd", required = true)
    protected String tpCd;
    @XmlElement(name = "Nm")
    protected List<String> nm;
    @XmlElement(name = "IsseDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar isseDtTm;
    @XmlElement(name = "Issr")
    protected TradeParty3 issr;
    @XmlElement(name = "LangCd")
    protected String langCd;
    @XmlElement(name = "CpyInd")
    protected Boolean cpyInd;
    @XmlElement(name = "DocPurp")
    protected String docPurp;
    @XmlElement(name = "InclNote")
    protected List<AdditionalInformation6> inclNote;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceHeader2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the tpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpCd() {
        return tpCd;
    }

    /**
     * Sets the value of the tpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceHeader2 setTpCd(String value) {
        this.tpCd = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNm() {
        if (nm == null) {
            nm = new ArrayList<String>();
        }
        return this.nm;
    }

    /**
     * Gets the value of the isseDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getIsseDtTm() {
        return isseDtTm;
    }

    /**
     * Sets the value of the isseDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceHeader2 setIsseDtTm(XMLGregorianCalendar value) {
        this.isseDtTm = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty3 }
     *     
     */
    public TradeParty3 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty3 }
     *     
     */
    public InvoiceHeader2 setIssr(TradeParty3 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the langCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCd() {
        return langCd;
    }

    /**
     * Sets the value of the langCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceHeader2 setLangCd(String value) {
        this.langCd = value;
        return this;
    }

    /**
     * Gets the value of the cpyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCpyInd() {
        return cpyInd;
    }

    /**
     * Sets the value of the cpyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvoiceHeader2 setCpyInd(Boolean value) {
        this.cpyInd = value;
        return this;
    }

    /**
     * Gets the value of the docPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocPurp() {
        return docPurp;
    }

    /**
     * Sets the value of the docPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceHeader2 setDocPurp(String value) {
        this.docPurp = value;
        return this;
    }

    /**
     * Gets the value of the inclNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inclNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation6 }
     * 
     * 
     */
    public List<AdditionalInformation6> getInclNote() {
        if (inclNote == null) {
            inclNote = new ArrayList<AdditionalInformation6>();
        }
        return this.inclNote;
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
     * Adds a new item to the nm list.
     * @see #getNm()
     * 
     */
    public InvoiceHeader2 addNm(String nm) {
        getNm().add(nm);
        return this;
    }

    /**
     * Adds a new item to the inclNote list.
     * @see #getInclNote()
     * 
     */
    public InvoiceHeader2 addInclNote(AdditionalInformation6 inclNote) {
        getInclNote().add(inclNote);
        return this;
    }

}
