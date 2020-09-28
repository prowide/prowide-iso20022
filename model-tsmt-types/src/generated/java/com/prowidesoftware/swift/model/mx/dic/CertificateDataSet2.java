
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
@XmlType(name = "CertificateDataSet2", propOrder = {
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
public class CertificateDataSet2 {

    @XmlElement(name = "DataSetId", required = true)
    protected DocumentIdentification1 dataSetId;
    @XmlElement(name = "CertTp", required = true)
    @XmlSchemaType(name = "string")
    protected TradeCertificateType1Code certTp;
    @XmlElement(name = "LineItm")
    protected List<LineItemAndPOIdentification1> lineItm;
    @XmlElement(name = "CertfdChrtcs", required = true)
    protected CertifiedCharacteristics2Choice certfdChrtcs;
    @XmlElement(name = "IsseDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
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
    public CertificateDataSet2 setDataSetId(DocumentIdentification1 value) {
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
    public CertificateDataSet2 setCertTp(TradeCertificateType1Code value) {
        this.certTp = value;
        return this;
    }

    /**
     * Gets the value of the lineItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItm property.
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
     */
    public List<LineItemAndPOIdentification1> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<LineItemAndPOIdentification1>();
        }
        return this.lineItm;
    }

    /**
     * Gets the value of the certfdChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedCharacteristics2Choice }
     *     
     */
    public CertifiedCharacteristics2Choice getCertfdChrtcs() {
        return certfdChrtcs;
    }

    /**
     * Sets the value of the certfdChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedCharacteristics2Choice }
     *     
     */
    public CertificateDataSet2 setCertfdChrtcs(CertifiedCharacteristics2Choice value) {
        this.certfdChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CertificateDataSet2 setIsseDt(XMLGregorianCalendar value) {
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
    public CertificateDataSet2 setPlcOfIsse(PostalAddress5 value) {
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
    public CertificateDataSet2 setIssr(PartyIdentification26 value) {
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
    public CertificateDataSet2 setInspctnDt(DatePeriodDetails value) {
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
    public CertificateDataSet2 setAuthrsdInspctrInd(Boolean value) {
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
    public CertificateDataSet2 setCertId(String value) {
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
    public CertificateDataSet2 setTrnsprt(SingleTransport3 value) {
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
    public CertificateDataSet2 setGoodsDesc(String value) {
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
    public CertificateDataSet2 setConsgnr(PartyIdentification26 value) {
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
    public CertificateDataSet2 setConsgn(PartyIdentification26 value) {
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
    public CertificateDataSet2 setManfctr(PartyIdentification26 value) {
        this.manfctr = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
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
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
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
    public CertificateDataSet2 addLineItm(LineItemAndPOIdentification1 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public CertificateDataSet2 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
