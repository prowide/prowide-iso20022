
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
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
 * Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateDataSet1", propOrder = {
    "dataSetId",
    "certTp",
    "lineItm",
    "certfdChrtcs",
    "isseDt",
    "plcOfIsse",
    "issr",
    "inspctnDt",
    "authrsdInspctrInd",
    "certId",
    "trnsprt",
    "goodsDesc",
    "consgnr",
    "consgn",
    "manfctr",
    "addtlInf"
})
public class CertificateDataSet1 {

    @XmlElement(name = "DataSetId", required = true)
    protected DocumentIdentification1 dataSetId;
    @XmlElement(name = "CertTp", required = true)
    @XmlSchemaType(name = "string")
    protected TradeCertificateType1Code certTp;
    @XmlElement(name = "LineItm")
    protected List<LineItemAndPOIdentification1> lineItm;
    @XmlElement(name = "CertfdChrtcs", required = true)
    protected CertifiedCharacteristics1Choice certfdChrtcs;
    @XmlElement(name = "IsseDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate isseDt;
    @XmlElement(name = "PlcOfIsse")
    protected PostalAddress5 plcOfIsse;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification26 issr;
    @XmlElement(name = "InspctnDt")
    protected DatePeriodDetails inspctnDt;
    @XmlElement(name = "AuthrsdInspctrInd")
    protected Boolean authrsdInspctrInd;
    @XmlElement(name = "CertId", required = true)
    protected String certId;
    @XmlElement(name = "Trnsprt")
    protected SingleTransport3 trnsprt;
    @XmlElement(name = "GoodsDesc")
    protected String goodsDesc;
    @XmlElement(name = "Consgnr")
    protected PartyIdentification26 consgnr;
    @XmlElement(name = "Consgn")
    protected PartyIdentification26 consgn;
    @XmlElement(name = "Manfctr")
    protected PartyIdentification26 manfctr;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

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
    public CertificateDataSet1 setDataSetId(DocumentIdentification1 value) {
        this.dataSetId = value;
        return this;
    }

    /**
     * Gets the value of the certTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCertificateType1Code }
     *     
     */
    public TradeCertificateType1Code getCertTp() {
        return certTp;
    }

    /**
     * Sets the value of the certTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCertificateType1Code }
     *     
     */
    public CertificateDataSet1 setCertTp(TradeCertificateType1Code value) {
        this.certTp = value;
        return this;
    }

    /**
     * Gets the value of the lineItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemAndPOIdentification1 }
     * 
     * 
     * @return
     *     The value of the lineItm property.
     */
    public List<LineItemAndPOIdentification1> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<>();
        }
        return this.lineItm;
    }

    /**
     * Gets the value of the certfdChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedCharacteristics1Choice }
     *     
     */
    public CertifiedCharacteristics1Choice getCertfdChrtcs() {
        return certfdChrtcs;
    }

    /**
     * Sets the value of the certfdChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedCharacteristics1Choice }
     *     
     */
    public CertificateDataSet1 setCertfdChrtcs(CertifiedCharacteristics1Choice value) {
        this.certfdChrtcs = value;
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
    public LocalDate getIsseDt() {
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
    public CertificateDataSet1 setIsseDt(LocalDate value) {
        this.isseDt = value;
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
    public CertificateDataSet1 setPlcOfIsse(PostalAddress5 value) {
        this.plcOfIsse = value;
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
    public CertificateDataSet1 setIssr(PartyIdentification26 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the inspctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails }
     *     
     */
    public DatePeriodDetails getInspctnDt() {
        return inspctnDt;
    }

    /**
     * Sets the value of the inspctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails }
     *     
     */
    public CertificateDataSet1 setInspctnDt(DatePeriodDetails value) {
        this.inspctnDt = value;
        return this;
    }

    /**
     * Gets the value of the authrsdInspctrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthrsdInspctrInd() {
        return authrsdInspctrInd;
    }

    /**
     * Sets the value of the authrsdInspctrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CertificateDataSet1 setAuthrsdInspctrInd(Boolean value) {
        this.authrsdInspctrInd = value;
        return this;
    }

    /**
     * Gets the value of the certId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertId() {
        return certId;
    }

    /**
     * Sets the value of the certId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CertificateDataSet1 setCertId(String value) {
        this.certId = value;
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
    public CertificateDataSet1 setTrnsprt(SingleTransport3 value) {
        this.trnsprt = value;
        return this;
    }

    /**
     * Gets the value of the goodsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * Sets the value of the goodsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CertificateDataSet1 setGoodsDesc(String value) {
        this.goodsDesc = value;
        return this;
    }

    /**
     * Gets the value of the consgnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getConsgnr() {
        return consgnr;
    }

    /**
     * Sets the value of the consgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public CertificateDataSet1 setConsgnr(PartyIdentification26 value) {
        this.consgnr = value;
        return this;
    }

    /**
     * Gets the value of the consgn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getConsgn() {
        return consgn;
    }

    /**
     * Sets the value of the consgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public CertificateDataSet1 setConsgn(PartyIdentification26 value) {
        this.consgn = value;
        return this;
    }

    /**
     * Gets the value of the manfctr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getManfctr() {
        return manfctr;
    }

    /**
     * Sets the value of the manfctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public CertificateDataSet1 setManfctr(PartyIdentification26 value) {
        this.manfctr = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the lineItm list.
     * @see #getLineItm()
     * 
     */
    public CertificateDataSet1 addLineItm(LineItemAndPOIdentification1 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public CertificateDataSet1 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
