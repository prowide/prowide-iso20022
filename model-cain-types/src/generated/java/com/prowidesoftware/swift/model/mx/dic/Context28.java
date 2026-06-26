
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
@XmlType(name = "Context28", propOrder = {
    "cardDataNtryMd",
    "othrCardDataNtryMd",
    "qrCdPresntmntMd",
    "mrchntCtgyCd",
    "mrchntCtgySpcfcData",
    "othrMrchntCtgy",
    "posCondCd",
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
    "tempScrCardDataReusd",
    "storgLctn",
    "pmtCrdntlMrchntRltsh",
    "pinPadInprbl",
    "pinNtryBpss",
    "iccFllbck",
    "iccFllbckRsnCd",
    "mgntcStrpFllbck",
    "authntcnOutg",
    "captrDt",
    "dtAntcptd",
    "prvtData",
    "ntlData"
})
public class Context28 {

    @XmlElement(name = "CardDataNtryMd", required = true)
    @XmlSchemaType(name = "string")
    protected CardDataReading11Code cardDataNtryMd;
    @XmlElement(name = "OthrCardDataNtryMd")
    protected String othrCardDataNtryMd;
    @XmlElement(name = "QRCdPresntmntMd")
    @XmlSchemaType(name = "string")
    protected QRCodePresentmentMode2Code qrCdPresntmntMd;
    @XmlElement(name = "MrchntCtgyCd", required = true)
    protected String mrchntCtgyCd;
    @XmlElement(name = "MrchntCtgySpcfcData")
    protected String mrchntCtgySpcfcData;
    @XmlElement(name = "OthrMrchntCtgy")
    protected String othrMrchntCtgy;
    @XmlElement(name = "POSCondCd")
    protected String posCondCd;
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
    protected List<SecurityCharacteristics2Code> sctyChrtcs;
    @XmlElement(name = "TempScrCardDataReusd")
    protected Boolean tempScrCardDataReusd;
    @XmlElement(name = "StorgLctn")
    protected String storgLctn;
    @XmlElement(name = "PmtCrdntlMrchntRltsh")
    protected Boolean pmtCrdntlMrchntRltsh;
    @XmlElement(name = "PINPadInprbl")
    protected Boolean pinPadInprbl;
    @XmlElement(name = "PINNtryBpss")
    protected Boolean pinNtryBpss;
    @XmlElement(name = "ICCFllbck")
    protected Boolean iccFllbck;
    @XmlElement(name = "ICCFllbckRsnCd")
    @XmlSchemaType(name = "string")
    protected ICCFallbackReason2Code iccFllbckRsnCd;
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
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the cardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading11Code }
     *     
     */
    public CardDataReading11Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Sets the value of the cardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading11Code }
     *     
     */
    public Context28 setCardDataNtryMd(CardDataReading11Code value) {
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
    public Context28 setOthrCardDataNtryMd(String value) {
        this.othrCardDataNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the qrCdPresntmntMd property.
     * 
     * @return
     *     possible object is
     *     {@link QRCodePresentmentMode2Code }
     *     
     */
    public QRCodePresentmentMode2Code getQRCdPresntmntMd() {
        return qrCdPresntmntMd;
    }

    /**
     * Sets the value of the qrCdPresntmntMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRCodePresentmentMode2Code }
     *     
     */
    public Context28 setQRCdPresntmntMd(QRCodePresentmentMode2Code value) {
        this.qrCdPresntmntMd = value;
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
    public Context28 setMrchntCtgyCd(String value) {
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
    public Context28 setMrchntCtgySpcfcData(String value) {
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
    public Context28 setOthrMrchntCtgy(String value) {
        this.othrMrchntCtgy = value;
        return this;
    }

    /**
     * Gets the value of the posCondCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSCondCd() {
        return posCondCd;
    }

    /**
     * Sets the value of the posCondCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context28 setPOSCondCd(String value) {
        this.posCondCd = value;
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
    public Context28 setCardPres(Boolean value) {
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
    public Context28 setCrdhldrPres(Boolean value) {
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
    public Context28 setCrdhldrActvtd(Boolean value) {
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
    public Context28 setTrnspndrInittd(Boolean value) {
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
    public Context28 setTrnst(Boolean value) {
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
    public Context28 setAttndd(Boolean value) {
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
    public Context28 setUattnddLvlCtgy(String value) {
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
    public Context28 setEComrcIndPropsd(String value) {
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
    public Context28 setEComrc(Boolean value) {
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
    public Context28 setEComrcIndApld(String value) {
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
    public Context28 setMOTOCd(MOTO2Code value) {
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
    public Context28 setFnlAuthstn(Boolean value) {
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
    public Context28 setCstmrCnsnt(Boolean value) {
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
    public Context28 setTxInitr(TransactionInitiator1Code value) {
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
    public Context28 setDelydChrgs(Boolean value) {
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
    public Context28 setNoShow(Boolean value) {
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
    public Context28 setReauthstn(Boolean value) {
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
    public Context28 setReSubmissn(Boolean value) {
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
    public Context28 setDelydAuthstn(Boolean value) {
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
    public Context28 setLatePresntmnt(Boolean value) {
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
    public Context28 setDfrrdDlvry(Boolean value) {
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
    public Context28 setPrtlShipmnt(Boolean value) {
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
    public Context28 setSpltPmt(Boolean value) {
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
    public Context28 setPrtlApprvlSpprtd(Boolean value) {
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
     * {@link SecurityCharacteristics2Code }
     * 
     * 
     * @return
     *     The value of the sctyChrtcs property.
     */
    public List<SecurityCharacteristics2Code> getSctyChrtcs() {
        if (sctyChrtcs == null) {
            sctyChrtcs = new ArrayList<>();
        }
        return this.sctyChrtcs;
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
    public Context28 setTempScrCardDataReusd(Boolean value) {
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
    public Context28 setStorgLctn(String value) {
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
    public Context28 setPmtCrdntlMrchntRltsh(Boolean value) {
        this.pmtCrdntlMrchntRltsh = value;
        return this;
    }

    /**
     * Gets the value of the pinPadInprbl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPINPadInprbl() {
        return pinPadInprbl;
    }

    /**
     * Sets the value of the pinPadInprbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Context28 setPINPadInprbl(Boolean value) {
        this.pinPadInprbl = value;
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
    public Context28 setPINNtryBpss(Boolean value) {
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
    public Context28 setICCFllbck(Boolean value) {
        this.iccFllbck = value;
        return this;
    }

    /**
     * Gets the value of the iccFllbckRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link ICCFallbackReason2Code }
     *     
     */
    public ICCFallbackReason2Code getICCFllbckRsnCd() {
        return iccFllbckRsnCd;
    }

    /**
     * Sets the value of the iccFllbckRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCFallbackReason2Code }
     *     
     */
    public Context28 setICCFllbckRsnCd(ICCFallbackReason2Code value) {
        this.iccFllbckRsnCd = value;
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
    public Context28 setMgntcStrpFllbck(Boolean value) {
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
    public Context28 setAuthntcnOutg(Boolean value) {
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
    public Context28 setCaptrDt(LocalDate value) {
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
    public Context28 setDtAntcptd(LocalDate value) {
        this.dtAntcptd = value;
        return this;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
    public Context28 addEComrcData(ECommerceData1 eComrcData) {
        getEComrcData().add(eComrcData);
        return this;
    }

    /**
     * Adds a new item to the sctyChrtcs list.
     * @see #getSctyChrtcs()
     * 
     */
    public Context28 addSctyChrtcs(SecurityCharacteristics2Code sctyChrtcs) {
        getSctyChrtcs().add(sctyChrtcs);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public Context28 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public Context28 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
