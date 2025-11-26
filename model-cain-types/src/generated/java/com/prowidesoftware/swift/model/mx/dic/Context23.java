
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
 * Context in which the card payment transaction is performed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context23", propOrder = {
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
    "eComrcIndPropsd",
    "eComrc",
    "eComrcIndApld",
    "eComrcData",
    "motoCd",
    "fnlAuthstn",
    "cstmrCnsnt",
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
    "tempScrCardDataReusd",
    "storgLctn",
    "pmtCrdntlMrchntRltsh",
    "pinPadInprtv",
    "pinNtryBpss",
    "iccFllbck",
    "iccFllbckRsnCd",
    "othrICCFllbckRsnCd",
    "mgntcStrpFllbck",
    "authntcnOutg",
    "captrDt",
    "dtAntcptd",
    "addtlData"
})
public class Context23 {

    @XmlElement(name = "CardDataNtryMd", required = true)
    @XmlSchemaType(name = "string")
    protected CardDataReading10Code cardDataNtryMd;
    @XmlElement(name = "OthrCardDataNtryMd")
    protected String othrCardDataNtryMd;
    @XmlElement(name = "QRCdPresntmntMd")
    @XmlSchemaType(name = "string")
    protected QRCodePresentmentMode1Code qrCdPresntmntMd;
    @XmlElement(name = "OthrQRCdPresntmntMd")
    protected String othrQRCdPresntmntMd;
    @XmlElement(name = "MrchntCtgyCd", required = true)
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
    @XmlElement(name = "EComrcIndPropsd")
    protected String eComrcIndPropsd;
    @XmlElement(name = "EComrc")
    protected Boolean eComrc;
    @XmlElement(name = "EComrcIndApld")
    protected String eComrcIndApld;
    @XmlElement(name = "EComrcData")
    protected List<ECommerceData1> eComrcData;
    @XmlElement(name = "MOTOCd")
    @XmlSchemaType(name = "string")
    protected MOTO2Code motoCd;
    @XmlElement(name = "FnlAuthstn")
    protected Boolean fnlAuthstn;
    @XmlElement(name = "CstmrCnsnt")
    protected Boolean cstmrCnsnt;
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
    @XmlElement(name = "TempScrCardDataReusd")
    protected Boolean tempScrCardDataReusd;
    @XmlElement(name = "StorgLctn")
    protected String storgLctn;
    @XmlElement(name = "PmtCrdntlMrchntRltsh")
    protected Boolean pmtCrdntlMrchntRltsh;
    @XmlElement(name = "PINPadInprtv")
    protected Boolean pinPadInprtv;
    @XmlElement(name = "PINNtryBpss")
    protected Boolean pinNtryBpss;
    @XmlElement(name = "ICCFllbck")
    protected Boolean iccFllbck;
    @XmlElement(name = "ICCFllbckRsnCd")
    @XmlSchemaType(name = "string")
    protected ICCFallbackReason1Code iccFllbckRsnCd;
    @XmlElement(name = "OthrICCFllbckRsnCd")
    protected String othrICCFllbckRsnCd;
    @XmlElement(name = "MgntcStrpFllbck")
    protected Boolean mgntcStrpFllbck;
    @XmlElement(name = "AuthntcnOutg")
    protected Boolean authntcnOutg;
    @XmlElement(name = "CaptrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate captrDt;
    @XmlElement(name = "DtAntcptd", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtAntcptd;
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
    public Context23 setCardDataNtryMd(CardDataReading10Code value) {
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
    public Context23 setOthrCardDataNtryMd(String value) {
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
    public Context23 setQRCdPresntmntMd(QRCodePresentmentMode1Code value) {
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
    public Context23 setOthrQRCdPresntmntMd(String value) {
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
    public Context23 setMrchntCtgyCd(String value) {
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
    public Context23 setMrchntCtgySpcfcData(String value) {
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
    public Context23 setOthrMrchntCtgy(String value) {
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
    public Context23 setCardPres(Boolean value) {
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
    public Context23 setCrdhldrPres(Boolean value) {
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
    public Context23 setCrdhldrActvtd(Boolean value) {
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
    public Context23 setTrnspndrInittd(Boolean value) {
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
    public Context23 setTrnst(Boolean value) {
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
    public Context23 setAttndd(Boolean value) {
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
    public Context23 setUattnddLvlCtgy(String value) {
        this.uattnddLvlCtgy = value;
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
    public Context23 setEComrcIndPropsd(String value) {
        this.eComrcIndPropsd = value;
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
    public Context23 setEComrc(Boolean value) {
        this.eComrc = value;
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
    public Context23 setEComrcIndApld(String value) {
        this.eComrcIndApld = value;
        return this;
    }

    /**
     * Gets the value of the eComrcData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the eComrcData property.
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
     * @return
     *     The value of the eComrcData property.
     */
    public List<ECommerceData1> getEComrcData() {
        if (eComrcData == null) {
            eComrcData = new ArrayList<>();
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
    public Context23 setMOTOCd(MOTO2Code value) {
        this.motoCd = value;
        return this;
    }

    /**
     * Gets the value of the fnlAuthstn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFnlAuthstn() {
        return fnlAuthstn;
    }

    /**
     * Sets the value of the fnlAuthstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context23 setFnlAuthstn(Boolean value) {
        this.fnlAuthstn = value;
        return this;
    }

    /**
     * Gets the value of the cstmrCnsnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstmrCnsnt() {
        return cstmrCnsnt;
    }

    /**
     * Sets the value of the cstmrCnsnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context23 setCstmrCnsnt(Boolean value) {
        this.cstmrCnsnt = value;
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
    public Context23 setTxInitr(TransactionInitiator1Code value) {
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
    public Context23 setDelydChrgs(Boolean value) {
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
    public Context23 setNoShow(Boolean value) {
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
    public Context23 setReauthstn(Boolean value) {
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
    public Context23 setReSubmissn(Boolean value) {
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
    public Context23 setDelydAuthstn(Boolean value) {
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
    public Context23 setLatePresntmnt(Boolean value) {
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
    public Context23 setDfrrdDlvry(Boolean value) {
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
    public Context23 setPrtlShipmnt(Boolean value) {
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
    public Context23 setSpltPmt(Boolean value) {
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
    public Context23 setPrtlApprvlSpprtd(Boolean value) {
        this.prtlApprvlSpprtd = value;
        return this;
    }

    /**
     * Gets the value of the sctyChrtcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctyChrtcs property.
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
     * @return
     *     The value of the sctyChrtcs property.
     */
    public List<SecurityCharacteristics1Code> getSctyChrtcs() {
        if (sctyChrtcs == null) {
            sctyChrtcs = new ArrayList<>();
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
    public Context23 setOthrSctyChrtcs(String value) {
        this.othrSctyChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the tempScrCardDataReusd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempScrCardDataReusd() {
        return tempScrCardDataReusd;
    }

    /**
     * Sets the value of the tempScrCardDataReusd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context23 setTempScrCardDataReusd(Boolean value) {
        this.tempScrCardDataReusd = value;
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
    public Context23 setStorgLctn(String value) {
        this.storgLctn = value;
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
    public Context23 setPmtCrdntlMrchntRltsh(Boolean value) {
        this.pmtCrdntlMrchntRltsh = value;
        return this;
    }

    /**
     * Gets the value of the pinPadInprtv property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPINPadInprtv() {
        return pinPadInprtv;
    }

    /**
     * Sets the value of the pinPadInprtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context23 setPINPadInprtv(Boolean value) {
        this.pinPadInprtv = value;
        return this;
    }

    /**
     * Gets the value of the pinNtryBpss property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPINNtryBpss() {
        return pinNtryBpss;
    }

    /**
     * Sets the value of the pinNtryBpss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context23 setPINNtryBpss(Boolean value) {
        this.pinNtryBpss = value;
        return this;
    }

    /**
     * Gets the value of the iccFllbck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isICCFllbck() {
        return iccFllbck;
    }

    /**
     * Sets the value of the iccFllbck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context23 setICCFllbck(Boolean value) {
        this.iccFllbck = value;
        return this;
    }

    /**
     * Gets the value of the iccFllbckRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link ICCFallbackReason1Code }
     *     
     */
    public ICCFallbackReason1Code getICCFllbckRsnCd() {
        return iccFllbckRsnCd;
    }

    /**
     * Sets the value of the iccFllbckRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCFallbackReason1Code }
     *     
     */
    public Context23 setICCFllbckRsnCd(ICCFallbackReason1Code value) {
        this.iccFllbckRsnCd = value;
        return this;
    }

    /**
     * Gets the value of the othrICCFllbckRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrICCFllbckRsnCd() {
        return othrICCFllbckRsnCd;
    }

    /**
     * Sets the value of the othrICCFllbckRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context23 setOthrICCFllbckRsnCd(String value) {
        this.othrICCFllbckRsnCd = value;
        return this;
    }

    /**
     * Gets the value of the mgntcStrpFllbck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMgntcStrpFllbck() {
        return mgntcStrpFllbck;
    }

    /**
     * Sets the value of the mgntcStrpFllbck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context23 setMgntcStrpFllbck(Boolean value) {
        this.mgntcStrpFllbck = value;
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
    public Context23 setAuthntcnOutg(Boolean value) {
        this.authntcnOutg = value;
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
    public LocalDate getCaptrDt() {
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
    public Context23 setCaptrDt(LocalDate value) {
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
    public LocalDate getDtAntcptd() {
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
    public Context23 setDtAntcptd(LocalDate value) {
        this.dtAntcptd = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
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
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
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
    public Context23 addEComrcData(ECommerceData1 eComrcData) {
        getEComrcData().add(eComrcData);
        return this;
    }

    /**
     * Adds a new item to the sctyChrtcs list.
     * @see #getSctyChrtcs()
     * 
     */
    public Context23 addSctyChrtcs(SecurityCharacteristics1Code sctyChrtcs) {
        getSctyChrtcs().add(sctyChrtcs);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Context23 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
