
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * General information that unambiguously identifies a document, such as identification number and issue date time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document28", propOrder = {
    "techRcrdIdr",
    "vrsn",
    "submissnTp",
    "rltdNtty",
    "rgltryDataTp",
    "vlntry",
    "hstrclData",
    "rltdPrd",
    "prsnlData",
    "pblctnPrd",
    "submissnDtTm",
    "homeCtry",
    "hstCtry",
    "rltdPdctIdr",
    "docRef",
    "rltdRgltryData",
    "dataRcrd"
})
public class Document28 {

    @XmlElement(name = "TechRcrdIdr")
    protected String techRcrdIdr;
    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "SubmissnTp")
    @XmlSchemaType(name = "string")
    protected TransactionOperationType13Code submissnTp;
    @XmlElement(name = "RltdNtty")
    protected List<PartyIdentification260Choice> rltdNtty;
    @XmlElement(name = "RgltryDataTp")
    protected List<ClassificationType4> rgltryDataTp;
    @XmlElement(name = "Vlntry")
    protected Boolean vlntry;
    @XmlElement(name = "HstrclData")
    protected Boolean hstrclData;
    @XmlElement(name = "RltdPrd")
    protected Period4Choice rltdPrd;
    @XmlElement(name = "PrsnlData")
    protected Boolean prsnlData;
    @XmlElement(name = "PblctnPrd")
    protected Period4Choice pblctnPrd;
    @XmlElement(name = "SubmissnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime submissnDtTm;
    @XmlElement(name = "HomeCtry")
    protected String homeCtry;
    @XmlElement(name = "HstCtry")
    protected List<String> hstCtry;
    @XmlElement(name = "RltdPdctIdr")
    protected List<SecurityIdentification49> rltdPdctIdr;
    @XmlElement(name = "DocRef")
    protected List<Document26> docRef;
    @XmlElement(name = "RltdRgltryData")
    protected List<GenericIdentification190> rltdRgltryData;
    @XmlElement(name = "DataRcrd")
    protected SupplementaryDataEnvelope1 dataRcrd;

    /**
     * Gets the value of the techRcrdIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdIdr() {
        return techRcrdIdr;
    }

    /**
     * Sets the value of the techRcrdIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Document28 setTechRcrdIdr(String value) {
        this.techRcrdIdr = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Document28 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the submissnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionOperationType13Code }
     *     
     */
    public TransactionOperationType13Code getSubmissnTp() {
        return submissnTp;
    }

    /**
     * Sets the value of the submissnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionOperationType13Code }
     *     
     */
    public Document28 setSubmissnTp(TransactionOperationType13Code value) {
        this.submissnTp = value;
        return this;
    }

    /**
     * Gets the value of the rltdNtty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdNtty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdNtty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification260Choice }
     * 
     * 
     * @return
     *     The value of the rltdNtty property.
     */
    public List<PartyIdentification260Choice> getRltdNtty() {
        if (rltdNtty == null) {
            rltdNtty = new ArrayList<>();
        }
        return this.rltdNtty;
    }

    /**
     * Gets the value of the rgltryDataTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rgltryDataTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgltryDataTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType4 }
     * 
     * 
     * @return
     *     The value of the rgltryDataTp property.
     */
    public List<ClassificationType4> getRgltryDataTp() {
        if (rgltryDataTp == null) {
            rgltryDataTp = new ArrayList<>();
        }
        return this.rgltryDataTp;
    }

    /**
     * Gets the value of the vlntry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVlntry() {
        return vlntry;
    }

    /**
     * Sets the value of the vlntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Document28 setVlntry(Boolean value) {
        this.vlntry = value;
        return this;
    }

    /**
     * Gets the value of the hstrclData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHstrclData() {
        return hstrclData;
    }

    /**
     * Sets the value of the hstrclData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Document28 setHstrclData(Boolean value) {
        this.hstrclData = value;
        return this;
    }

    /**
     * Gets the value of the rltdPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getRltdPrd() {
        return rltdPrd;
    }

    /**
     * Sets the value of the rltdPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public Document28 setRltdPrd(Period4Choice value) {
        this.rltdPrd = value;
        return this;
    }

    /**
     * Gets the value of the prsnlData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrsnlData() {
        return prsnlData;
    }

    /**
     * Sets the value of the prsnlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Document28 setPrsnlData(Boolean value) {
        this.prsnlData = value;
        return this;
    }

    /**
     * Gets the value of the pblctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getPblctnPrd() {
        return pblctnPrd;
    }

    /**
     * Sets the value of the pblctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public Document28 setPblctnPrd(Period4Choice value) {
        this.pblctnPrd = value;
        return this;
    }

    /**
     * Gets the value of the submissnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getSubmissnDtTm() {
        return submissnDtTm;
    }

    /**
     * Sets the value of the submissnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Document28 setSubmissnDtTm(OffsetDateTime value) {
        this.submissnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the homeCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCtry() {
        return homeCtry;
    }

    /**
     * Sets the value of the homeCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Document28 setHomeCtry(String value) {
        this.homeCtry = value;
        return this;
    }

    /**
     * Gets the value of the hstCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hstCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHstCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the hstCtry property.
     */
    public List<String> getHstCtry() {
        if (hstCtry == null) {
            hstCtry = new ArrayList<>();
        }
        return this.hstCtry;
    }

    /**
     * Gets the value of the rltdPdctIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdPdctIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdPdctIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification49 }
     * 
     * 
     * @return
     *     The value of the rltdPdctIdr property.
     */
    public List<SecurityIdentification49> getRltdPdctIdr() {
        if (rltdPdctIdr == null) {
            rltdPdctIdr = new ArrayList<>();
        }
        return this.rltdPdctIdr;
    }

    /**
     * Gets the value of the docRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the docRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document26 }
     * 
     * 
     * @return
     *     The value of the docRef property.
     */
    public List<Document26> getDocRef() {
        if (docRef == null) {
            docRef = new ArrayList<>();
        }
        return this.docRef;
    }

    /**
     * Gets the value of the rltdRgltryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdRgltryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRgltryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification190 }
     * 
     * 
     * @return
     *     The value of the rltdRgltryData property.
     */
    public List<GenericIdentification190> getRltdRgltryData() {
        if (rltdRgltryData == null) {
            rltdRgltryData = new ArrayList<>();
        }
        return this.rltdRgltryData;
    }

    /**
     * Gets the value of the dataRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryDataEnvelope1 }
     *     
     */
    public SupplementaryDataEnvelope1 getDataRcrd() {
        return dataRcrd;
    }

    /**
     * Sets the value of the dataRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryDataEnvelope1 }
     *     
     */
    public Document28 setDataRcrd(SupplementaryDataEnvelope1 value) {
        this.dataRcrd = value;
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
     * Adds a new item to the rltdNtty list.
     * @see #getRltdNtty()
     * 
     */
    public Document28 addRltdNtty(PartyIdentification260Choice rltdNtty) {
        getRltdNtty().add(rltdNtty);
        return this;
    }

    /**
     * Adds a new item to the rgltryDataTp list.
     * @see #getRgltryDataTp()
     * 
     */
    public Document28 addRgltryDataTp(ClassificationType4 rgltryDataTp) {
        getRgltryDataTp().add(rgltryDataTp);
        return this;
    }

    /**
     * Adds a new item to the hstCtry list.
     * @see #getHstCtry()
     * 
     */
    public Document28 addHstCtry(String hstCtry) {
        getHstCtry().add(hstCtry);
        return this;
    }

    /**
     * Adds a new item to the rltdPdctIdr list.
     * @see #getRltdPdctIdr()
     * 
     */
    public Document28 addRltdPdctIdr(SecurityIdentification49 rltdPdctIdr) {
        getRltdPdctIdr().add(rltdPdctIdr);
        return this;
    }

    /**
     * Adds a new item to the docRef list.
     * @see #getDocRef()
     * 
     */
    public Document28 addDocRef(Document26 docRef) {
        getDocRef().add(docRef);
        return this;
    }

    /**
     * Adds a new item to the rltdRgltryData list.
     * @see #getRltdRgltryData()
     * 
     */
    public Document28 addRltdRgltryData(GenericIdentification190 rltdRgltryData) {
        getRltdRgltryData().add(rltdRgltryData);
        return this;
    }

}
