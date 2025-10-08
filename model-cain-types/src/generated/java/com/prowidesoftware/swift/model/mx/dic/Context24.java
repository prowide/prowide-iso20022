
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
 * Context in which the card payment transaction is performed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context24", propOrder = {
    "cardDataNtryMd",
    "othrCardDataNtryMd",
    "qrCdPresntmntMd",
    "othrQRCdPresntmntMd",
    "mrchntCtgyCd",
    "mrchntCtgySpcfcData",
    "othrMrchntCtgy",
    "cardPres",
    "crdhldrPres",
    "crdhldrActvtd",
    "trnspndrInittd",
    "trnst",
    "attndd",
    "uattnddLvlCtgy",
    "eComrc",
    "eComrcIndPropsd",
    "eComrcIndApld",
    "eComrcData",
    "motoCd",
    "txInitr",
    "delydChrgs",
    "noShow",
    "reauthstn",
    "reSubmissn",
    "delydAuthstn",
    "latePresntmnt",
    "dfrrdDlvry",
    "prtlShipmnt",
    "spltPmt",
    "prtlApprvlSpprtd",
    "sctyChrtcs",
    "othrSctyChrtcs",
    "storgLctn",
    "authntcnOutg",
    "pmtCrdntlMrchntRltsh",
    "captrDt",
    "dtAntcptd",
    "saleRefNb",
    "goodsAndSvcsTp",
    "goodAndSvcsSubTp",
    "goodAndSvcsOthrSubTp",
    "goodAndSvcDlvryChanl",
    "othrGoodAndSvcDlvryChanl",
    "goodAndSvcDlvrySchdl",
    "othrGoodAndSvcDlvrySchdl",
    "rctReq",
    "rctTp",
    "rctDstn",
    "addtlData"
})
public class Context24 {

    @XmlElement(name = "CardDataNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading10Code cardDataNtryMd;
    @XmlElement(name = "OthrCardDataNtryMd")
    protected String othrCardDataNtryMd;
    @XmlElement(name = "QRCdPresntmntMd")
    @XmlSchemaType(name = "string")
    protected QRCodePresentmentMode1Code qrCdPresntmntMd;
    @XmlElement(name = "OthrQRCdPresntmntMd")
    protected String othrQRCdPresntmntMd;
    @XmlElement(name = "MrchntCtgyCd")
    protected String mrchntCtgyCd;
    @XmlElement(name = "MrchntCtgySpcfcData")
    protected String mrchntCtgySpcfcData;
    @XmlElement(name = "OthrMrchntCtgy")
    protected String othrMrchntCtgy;
    @XmlElement(name = "CardPres")
    protected Boolean cardPres;
    @XmlElement(name = "CrdhldrPres")
    protected Boolean crdhldrPres;
    @XmlElement(name = "CrdhldrActvtd")
    protected Boolean crdhldrActvtd;
    @XmlElement(name = "TrnspndrInittd")
    protected Boolean trnspndrInittd;
    @XmlElement(name = "Trnst")
    protected Boolean trnst;
    @XmlElement(name = "Attndd")
    protected Boolean attndd;
    @XmlElement(name = "UattnddLvlCtgy")
    protected String uattnddLvlCtgy;
    @XmlElement(name = "EComrc")
    protected Boolean eComrc;
    @XmlElement(name = "EComrcIndPropsd")
    protected String eComrcIndPropsd;
    @XmlElement(name = "EComrcIndApld")
    protected String eComrcIndApld;
    @XmlElement(name = "EComrcData")
    protected List<ECommerceData1> eComrcData;
    @XmlElement(name = "MOTOCd")
    @XmlSchemaType(name = "string")
    protected MOTO2Code motoCd;
    @XmlElement(name = "TxInitr")
    @XmlSchemaType(name = "string")
    protected TransactionInitiator1Code txInitr;
    @XmlElement(name = "DelydChrgs")
    protected Boolean delydChrgs;
    @XmlElement(name = "NoShow")
    protected Boolean noShow;
    @XmlElement(name = "Reauthstn")
    protected Boolean reauthstn;
    @XmlElement(name = "ReSubmissn")
    protected Boolean reSubmissn;
    @XmlElement(name = "DelydAuthstn")
    protected Boolean delydAuthstn;
    @XmlElement(name = "LatePresntmnt")
    protected Boolean latePresntmnt;
    @XmlElement(name = "DfrrdDlvry")
    protected Boolean dfrrdDlvry;
    @XmlElement(name = "PrtlShipmnt")
    protected Boolean prtlShipmnt;
    @XmlElement(name = "SpltPmt")
    protected Boolean spltPmt;
    @XmlElement(name = "PrtlApprvlSpprtd")
    protected Boolean prtlApprvlSpprtd;
    @XmlElement(name = "SctyChrtcs")
    @XmlSchemaType(name = "string")
    protected List<SecurityCharacteristics1Code> sctyChrtcs;
    @XmlElement(name = "OthrSctyChrtcs")
    protected String othrSctyChrtcs;
    @XmlElement(name = "StorgLctn")
    protected String storgLctn;
    @XmlElement(name = "AuthntcnOutg")
    protected Boolean authntcnOutg;
    @XmlElement(name = "PmtCrdntlMrchntRltsh")
    protected Boolean pmtCrdntlMrchntRltsh;
    @XmlElement(name = "CaptrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar captrDt;
    @XmlElement(name = "DtAntcptd", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtAntcptd;
    @XmlElement(name = "SaleRefNb")
    protected String saleRefNb;
    @XmlElement(name = "GoodsAndSvcsTp")
    @XmlSchemaType(name = "string")
    protected GoodsAndServices1Code goodsAndSvcsTp;
    @XmlElement(name = "GoodAndSvcsSubTp")
    @XmlSchemaType(name = "string")
    protected GoodsAndServicesSubType1Code goodAndSvcsSubTp;
    @XmlElement(name = "GoodAndSvcsOthrSubTp")
    protected String goodAndSvcsOthrSubTp;
    @XmlElement(name = "GoodAndSvcDlvryChanl")
    @XmlSchemaType(name = "string")
    protected GoodAndServiceDeliveryChannel1Code goodAndSvcDlvryChanl;
    @XmlElement(name = "OthrGoodAndSvcDlvryChanl")
    protected String othrGoodAndSvcDlvryChanl;
    @XmlElement(name = "GoodAndSvcDlvrySchdl")
    @XmlSchemaType(name = "string")
    protected GoodAndServiceDeliverySchedule1Code goodAndSvcDlvrySchdl;
    @XmlElement(name = "OthrGoodAndSvcDlvrySchdl")
    protected String othrGoodAndSvcDlvrySchdl;
    @XmlElement(name = "RctReq")
    protected Boolean rctReq;
    @XmlElement(name = "RctTp")
    @XmlSchemaType(name = "string")
    protected List<ReceiptType1Code> rctTp;
    @XmlElement(name = "RctDstn")
    protected String rctDstn;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the cardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading10Code }
     *     
     */
    public CardDataReading10Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Sets the value of the cardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading10Code }
     *     
     */
    public Context24 setCardDataNtryMd(CardDataReading10Code value) {
        this.cardDataNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the othrCardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrCardDataNtryMd() {
        return othrCardDataNtryMd;
    }

    /**
     * Sets the value of the othrCardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setOthrCardDataNtryMd(String value) {
        this.othrCardDataNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the qrCdPresntmntMd property.
     * 
     * @return
     *     possible object is
     *     {@link QRCodePresentmentMode1Code }
     *     
     */
    public QRCodePresentmentMode1Code getQRCdPresntmntMd() {
        return qrCdPresntmntMd;
    }

    /**
     * Sets the value of the qrCdPresntmntMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRCodePresentmentMode1Code }
     *     
     */
    public Context24 setQRCdPresntmntMd(QRCodePresentmentMode1Code value) {
        this.qrCdPresntmntMd = value;
        return this;
    }

    /**
     * Gets the value of the othrQRCdPresntmntMd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrQRCdPresntmntMd() {
        return othrQRCdPresntmntMd;
    }

    /**
     * Sets the value of the othrQRCdPresntmntMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setOthrQRCdPresntmntMd(String value) {
        this.othrQRCdPresntmntMd = value;
        return this;
    }

    /**
     * Gets the value of the mrchntCtgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgyCd() {
        return mrchntCtgyCd;
    }

    /**
     * Sets the value of the mrchntCtgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setMrchntCtgyCd(String value) {
        this.mrchntCtgyCd = value;
        return this;
    }

    /**
     * Gets the value of the mrchntCtgySpcfcData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgySpcfcData() {
        return mrchntCtgySpcfcData;
    }

    /**
     * Sets the value of the mrchntCtgySpcfcData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setMrchntCtgySpcfcData(String value) {
        this.mrchntCtgySpcfcData = value;
        return this;
    }

    /**
     * Gets the value of the othrMrchntCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrMrchntCtgy() {
        return othrMrchntCtgy;
    }

    /**
     * Sets the value of the othrMrchntCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setOthrMrchntCtgy(String value) {
        this.othrMrchntCtgy = value;
        return this;
    }

    /**
     * Gets the value of the cardPres property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardPres() {
        return cardPres;
    }

    /**
     * Sets the value of the cardPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setCardPres(Boolean value) {
        this.cardPres = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrPres property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrdhldrPres() {
        return crdhldrPres;
    }

    /**
     * Sets the value of the crdhldrPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setCrdhldrPres(Boolean value) {
        this.crdhldrPres = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrActvtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrdhldrActvtd() {
        return crdhldrActvtd;
    }

    /**
     * Sets the value of the crdhldrActvtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setCrdhldrActvtd(Boolean value) {
        this.crdhldrActvtd = value;
        return this;
    }

    /**
     * Gets the value of the trnspndrInittd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrnspndrInittd() {
        return trnspndrInittd;
    }

    /**
     * Sets the value of the trnspndrInittd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setTrnspndrInittd(Boolean value) {
        this.trnspndrInittd = value;
        return this;
    }

    /**
     * Gets the value of the trnst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrnst() {
        return trnst;
    }

    /**
     * Sets the value of the trnst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setTrnst(Boolean value) {
        this.trnst = value;
        return this;
    }

    /**
     * Gets the value of the attndd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttndd() {
        return attndd;
    }

    /**
     * Sets the value of the attndd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setAttndd(Boolean value) {
        this.attndd = value;
        return this;
    }

    /**
     * Gets the value of the uattnddLvlCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUattnddLvlCtgy() {
        return uattnddLvlCtgy;
    }

    /**
     * Sets the value of the uattnddLvlCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setUattnddLvlCtgy(String value) {
        this.uattnddLvlCtgy = value;
        return this;
    }

    /**
     * Gets the value of the eComrc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEComrc() {
        return eComrc;
    }

    /**
     * Sets the value of the eComrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setEComrc(Boolean value) {
        this.eComrc = value;
        return this;
    }

    /**
     * Gets the value of the eComrcIndPropsd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEComrcIndPropsd() {
        return eComrcIndPropsd;
    }

    /**
     * Sets the value of the eComrcIndPropsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setEComrcIndPropsd(String value) {
        this.eComrcIndPropsd = value;
        return this;
    }

    /**
     * Gets the value of the eComrcIndApld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEComrcIndApld() {
        return eComrcIndApld;
    }

    /**
     * Sets the value of the eComrcIndApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setEComrcIndApld(String value) {
        this.eComrcIndApld = value;
        return this;
    }

    /**
     * Gets the value of the eComrcData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eComrcData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEComrcData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECommerceData1 }
     * 
     * 
     */
    public List<ECommerceData1> getEComrcData() {
        if (eComrcData == null) {
            eComrcData = new ArrayList<ECommerceData1>();
        }
        return this.eComrcData;
    }

    /**
     * Gets the value of the motoCd property.
     * 
     * @return
     *     possible object is
     *     {@link MOTO2Code }
     *     
     */
    public MOTO2Code getMOTOCd() {
        return motoCd;
    }

    /**
     * Sets the value of the motoCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOTO2Code }
     *     
     */
    public Context24 setMOTOCd(MOTO2Code value) {
        this.motoCd = value;
        return this;
    }

    /**
     * Gets the value of the txInitr property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInitiator1Code }
     *     
     */
    public TransactionInitiator1Code getTxInitr() {
        return txInitr;
    }

    /**
     * Sets the value of the txInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInitiator1Code }
     *     
     */
    public Context24 setTxInitr(TransactionInitiator1Code value) {
        this.txInitr = value;
        return this;
    }

    /**
     * Gets the value of the delydChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelydChrgs() {
        return delydChrgs;
    }

    /**
     * Sets the value of the delydChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setDelydChrgs(Boolean value) {
        this.delydChrgs = value;
        return this;
    }

    /**
     * Gets the value of the noShow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoShow() {
        return noShow;
    }

    /**
     * Sets the value of the noShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setNoShow(Boolean value) {
        this.noShow = value;
        return this;
    }

    /**
     * Gets the value of the reauthstn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReauthstn() {
        return reauthstn;
    }

    /**
     * Sets the value of the reauthstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setReauthstn(Boolean value) {
        this.reauthstn = value;
        return this;
    }

    /**
     * Gets the value of the reSubmissn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReSubmissn() {
        return reSubmissn;
    }

    /**
     * Sets the value of the reSubmissn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setReSubmissn(Boolean value) {
        this.reSubmissn = value;
        return this;
    }

    /**
     * Gets the value of the delydAuthstn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelydAuthstn() {
        return delydAuthstn;
    }

    /**
     * Sets the value of the delydAuthstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setDelydAuthstn(Boolean value) {
        this.delydAuthstn = value;
        return this;
    }

    /**
     * Gets the value of the latePresntmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatePresntmnt() {
        return latePresntmnt;
    }

    /**
     * Sets the value of the latePresntmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setLatePresntmnt(Boolean value) {
        this.latePresntmnt = value;
        return this;
    }

    /**
     * Gets the value of the dfrrdDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfrrdDlvry() {
        return dfrrdDlvry;
    }

    /**
     * Sets the value of the dfrrdDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setDfrrdDlvry(Boolean value) {
        this.dfrrdDlvry = value;
        return this;
    }

    /**
     * Gets the value of the prtlShipmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlShipmnt() {
        return prtlShipmnt;
    }

    /**
     * Sets the value of the prtlShipmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setPrtlShipmnt(Boolean value) {
        this.prtlShipmnt = value;
        return this;
    }

    /**
     * Gets the value of the spltPmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpltPmt() {
        return spltPmt;
    }

    /**
     * Sets the value of the spltPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setSpltPmt(Boolean value) {
        this.spltPmt = value;
        return this;
    }

    /**
     * Gets the value of the prtlApprvlSpprtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlApprvlSpprtd() {
        return prtlApprvlSpprtd;
    }

    /**
     * Sets the value of the prtlApprvlSpprtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setPrtlApprvlSpprtd(Boolean value) {
        this.prtlApprvlSpprtd = value;
        return this;
    }

    /**
     * Gets the value of the sctyChrtcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctyChrtcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyChrtcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityCharacteristics1Code }
     * 
     * 
     */
    public List<SecurityCharacteristics1Code> getSctyChrtcs() {
        if (sctyChrtcs == null) {
            sctyChrtcs = new ArrayList<SecurityCharacteristics1Code>();
        }
        return this.sctyChrtcs;
    }

    /**
     * Gets the value of the othrSctyChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrSctyChrtcs() {
        return othrSctyChrtcs;
    }

    /**
     * Sets the value of the othrSctyChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setOthrSctyChrtcs(String value) {
        this.othrSctyChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the storgLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorgLctn() {
        return storgLctn;
    }

    /**
     * Sets the value of the storgLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setStorgLctn(String value) {
        this.storgLctn = value;
        return this;
    }

    /**
     * Gets the value of the authntcnOutg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthntcnOutg() {
        return authntcnOutg;
    }

    /**
     * Sets the value of the authntcnOutg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setAuthntcnOutg(Boolean value) {
        this.authntcnOutg = value;
        return this;
    }

    /**
     * Gets the value of the pmtCrdntlMrchntRltsh property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtCrdntlMrchntRltsh() {
        return pmtCrdntlMrchntRltsh;
    }

    /**
     * Sets the value of the pmtCrdntlMrchntRltsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setPmtCrdntlMrchntRltsh(Boolean value) {
        this.pmtCrdntlMrchntRltsh = value;
        return this;
    }

    /**
     * Gets the value of the captrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCaptrDt() {
        return captrDt;
    }

    /**
     * Sets the value of the captrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setCaptrDt(XMLGregorianCalendar value) {
        this.captrDt = value;
        return this;
    }

    /**
     * Gets the value of the dtAntcptd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDtAntcptd() {
        return dtAntcptd;
    }

    /**
     * Sets the value of the dtAntcptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setDtAntcptd(XMLGregorianCalendar value) {
        this.dtAntcptd = value;
        return this;
    }

    /**
     * Gets the value of the saleRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefNb() {
        return saleRefNb;
    }

    /**
     * Sets the value of the saleRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setSaleRefNb(String value) {
        this.saleRefNb = value;
        return this;
    }

    /**
     * Gets the value of the goodsAndSvcsTp property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsAndServices1Code }
     *     
     */
    public GoodsAndServices1Code getGoodsAndSvcsTp() {
        return goodsAndSvcsTp;
    }

    /**
     * Sets the value of the goodsAndSvcsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsAndServices1Code }
     *     
     */
    public Context24 setGoodsAndSvcsTp(GoodsAndServices1Code value) {
        this.goodsAndSvcsTp = value;
        return this;
    }

    /**
     * Gets the value of the goodAndSvcsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsAndServicesSubType1Code }
     *     
     */
    public GoodsAndServicesSubType1Code getGoodAndSvcsSubTp() {
        return goodAndSvcsSubTp;
    }

    /**
     * Sets the value of the goodAndSvcsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsAndServicesSubType1Code }
     *     
     */
    public Context24 setGoodAndSvcsSubTp(GoodsAndServicesSubType1Code value) {
        this.goodAndSvcsSubTp = value;
        return this;
    }

    /**
     * Gets the value of the goodAndSvcsOthrSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodAndSvcsOthrSubTp() {
        return goodAndSvcsOthrSubTp;
    }

    /**
     * Sets the value of the goodAndSvcsOthrSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setGoodAndSvcsOthrSubTp(String value) {
        this.goodAndSvcsOthrSubTp = value;
        return this;
    }

    /**
     * Gets the value of the goodAndSvcDlvryChanl property.
     * 
     * @return
     *     possible object is
     *     {@link GoodAndServiceDeliveryChannel1Code }
     *     
     */
    public GoodAndServiceDeliveryChannel1Code getGoodAndSvcDlvryChanl() {
        return goodAndSvcDlvryChanl;
    }

    /**
     * Sets the value of the goodAndSvcDlvryChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodAndServiceDeliveryChannel1Code }
     *     
     */
    public Context24 setGoodAndSvcDlvryChanl(GoodAndServiceDeliveryChannel1Code value) {
        this.goodAndSvcDlvryChanl = value;
        return this;
    }

    /**
     * Gets the value of the othrGoodAndSvcDlvryChanl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrGoodAndSvcDlvryChanl() {
        return othrGoodAndSvcDlvryChanl;
    }

    /**
     * Sets the value of the othrGoodAndSvcDlvryChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setOthrGoodAndSvcDlvryChanl(String value) {
        this.othrGoodAndSvcDlvryChanl = value;
        return this;
    }

    /**
     * Gets the value of the goodAndSvcDlvrySchdl property.
     * 
     * @return
     *     possible object is
     *     {@link GoodAndServiceDeliverySchedule1Code }
     *     
     */
    public GoodAndServiceDeliverySchedule1Code getGoodAndSvcDlvrySchdl() {
        return goodAndSvcDlvrySchdl;
    }

    /**
     * Sets the value of the goodAndSvcDlvrySchdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodAndServiceDeliverySchedule1Code }
     *     
     */
    public Context24 setGoodAndSvcDlvrySchdl(GoodAndServiceDeliverySchedule1Code value) {
        this.goodAndSvcDlvrySchdl = value;
        return this;
    }

    /**
     * Gets the value of the othrGoodAndSvcDlvrySchdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrGoodAndSvcDlvrySchdl() {
        return othrGoodAndSvcDlvrySchdl;
    }

    /**
     * Sets the value of the othrGoodAndSvcDlvrySchdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setOthrGoodAndSvcDlvrySchdl(String value) {
        this.othrGoodAndSvcDlvrySchdl = value;
        return this;
    }

    /**
     * Gets the value of the rctReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRctReq() {
        return rctReq;
    }

    /**
     * Sets the value of the rctReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context24 setRctReq(Boolean value) {
        this.rctReq = value;
        return this;
    }

    /**
     * Gets the value of the rctTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rctTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRctTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptType1Code }
     * 
     * 
     */
    public List<ReceiptType1Code> getRctTp() {
        if (rctTp == null) {
            rctTp = new ArrayList<ReceiptType1Code>();
        }
        return this.rctTp;
    }

    /**
     * Gets the value of the rctDstn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRctDstn() {
        return rctDstn;
    }

    /**
     * Sets the value of the rctDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context24 setRctDstn(String value) {
        this.rctDstn = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
        }
        return this.addtlData;
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
     * Adds a new item to the eComrcData list.
     * @see #getEComrcData()
     * 
     */
    public Context24 addEComrcData(ECommerceData1 eComrcData) {
        getEComrcData().add(eComrcData);
        return this;
    }

    /**
     * Adds a new item to the sctyChrtcs list.
     * @see #getSctyChrtcs()
     * 
     */
    public Context24 addSctyChrtcs(SecurityCharacteristics1Code sctyChrtcs) {
        getSctyChrtcs().add(sctyChrtcs);
        return this;
    }

    /**
     * Adds a new item to the rctTp list.
     * @see #getRctTp()
     * 
     */
    public Context24 addRctTp(ReceiptType1Code rctTp) {
        getRctTp().add(rctTp);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Context24 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
