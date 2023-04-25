
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceDataSet1", propOrder = {
    "dataSetId",
    "issr",
    "isseDt",
    "fctvDt",
    "plcOfIsse",
    "insrncDocId",
    "trnsprt",
    "insrdAmt",
    "insrdGoodsDesc",
    "insrncConds",
    "insrncClauses",
    "assrd",
    "clmsPyblAt",
    "clmsPyblIn"
})
public class InsuranceDataSet1 {

    @XmlElement(name = "DataSetId", required = true)
    protected DocumentIdentification1 dataSetId;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification26 issr;
    @XmlElement(name = "IsseDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar isseDt;
    @XmlElement(name = "FctvDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar fctvDt;
    @XmlElement(name = "PlcOfIsse")
    protected PostalAddress5 plcOfIsse;
    @XmlElement(name = "InsrncDocId", required = true)
    protected String insrncDocId;
    @XmlElement(name = "Trnsprt")
    protected SingleTransport3 trnsprt;
    @XmlElement(name = "InsrdAmt", required = true)
    protected CurrencyAndAmount insrdAmt;
    @XmlElement(name = "InsrdGoodsDesc")
    protected String insrdGoodsDesc;
    @XmlElement(name = "InsrncConds")
    protected List<String> insrncConds;
    @XmlElement(name = "InsrncClauses")
    @XmlSchemaType(name = "string")
    protected List<InsuranceClauses1Code> insrncClauses;
    @XmlElement(name = "Assrd", required = true)
    protected PartyIdentification29Choice assrd;
    @XmlElement(name = "ClmsPyblAt", required = true)
    protected PostalAddress5 clmsPyblAt;
    @XmlElement(name = "ClmsPyblIn")
    protected String clmsPyblIn;

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public DocumentIdentification1 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public InsuranceDataSet1 setDataSetId(DocumentIdentification1 value) {
        this.dataSetId = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public InsuranceDataSet1 setIssr(PartyIdentification26 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InsuranceDataSet1 setIsseDt(Calendar value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InsuranceDataSet1 setFctvDt(Calendar value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the plcOfIsse property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress5 }
     *     
     */
    public PostalAddress5 getPlcOfIsse() {
        return plcOfIsse;
    }

    /**
     * Sets the value of the plcOfIsse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress5 }
     *     
     */
    public InsuranceDataSet1 setPlcOfIsse(PostalAddress5 value) {
        this.plcOfIsse = value;
        return this;
    }

    /**
     * Gets the value of the insrncDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsrncDocId() {
        return insrncDocId;
    }

    /**
     * Sets the value of the insrncDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InsuranceDataSet1 setInsrncDocId(String value) {
        this.insrncDocId = value;
        return this;
    }

    /**
     * Gets the value of the trnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link SingleTransport3 }
     *     
     */
    public SingleTransport3 getTrnsprt() {
        return trnsprt;
    }

    /**
     * Sets the value of the trnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleTransport3 }
     *     
     */
    public InsuranceDataSet1 setTrnsprt(SingleTransport3 value) {
        this.trnsprt = value;
        return this;
    }

    /**
     * Gets the value of the insrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getInsrdAmt() {
        return insrdAmt;
    }

    /**
     * Sets the value of the insrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public InsuranceDataSet1 setInsrdAmt(CurrencyAndAmount value) {
        this.insrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the insrdGoodsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsrdGoodsDesc() {
        return insrdGoodsDesc;
    }

    /**
     * Sets the value of the insrdGoodsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InsuranceDataSet1 setInsrdGoodsDesc(String value) {
        this.insrdGoodsDesc = value;
        return this;
    }

    /**
     * Gets the value of the insrncConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the insrncConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsrncConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the insrncConds property.
     */
    public List<String> getInsrncConds() {
        if (insrncConds == null) {
            insrncConds = new ArrayList<>();
        }
        return this.insrncConds;
    }

    /**
     * Gets the value of the insrncClauses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the insrncClauses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsrncClauses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceClauses1Code }
     * 
     * 
     * @return
     *     The value of the insrncClauses property.
     */
    public List<InsuranceClauses1Code> getInsrncClauses() {
        if (insrncClauses == null) {
            insrncClauses = new ArrayList<>();
        }
        return this.insrncClauses;
    }

    /**
     * Gets the value of the assrd property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification29Choice }
     *     
     */
    public PartyIdentification29Choice getAssrd() {
        return assrd;
    }

    /**
     * Sets the value of the assrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification29Choice }
     *     
     */
    public InsuranceDataSet1 setAssrd(PartyIdentification29Choice value) {
        this.assrd = value;
        return this;
    }

    /**
     * Gets the value of the clmsPyblAt property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress5 }
     *     
     */
    public PostalAddress5 getClmsPyblAt() {
        return clmsPyblAt;
    }

    /**
     * Sets the value of the clmsPyblAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress5 }
     *     
     */
    public InsuranceDataSet1 setClmsPyblAt(PostalAddress5 value) {
        this.clmsPyblAt = value;
        return this;
    }

    /**
     * Gets the value of the clmsPyblIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClmsPyblIn() {
        return clmsPyblIn;
    }

    /**
     * Sets the value of the clmsPyblIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InsuranceDataSet1 setClmsPyblIn(String value) {
        this.clmsPyblIn = value;
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
     * Adds a new item to the insrncConds list.
     * @see #getInsrncConds()
     * 
     */
    public InsuranceDataSet1 addInsrncConds(String insrncConds) {
        getInsrncConds().add(insrncConds);
        return this;
    }

    /**
     * Adds a new item to the insrncClauses list.
     * @see #getInsrncClauses()
     * 
     */
    public InsuranceDataSet1 addInsrncClauses(InsuranceClauses1Code insrncClauses) {
        getInsrncClauses().add(insrncClauses);
        return this;
    }

}
