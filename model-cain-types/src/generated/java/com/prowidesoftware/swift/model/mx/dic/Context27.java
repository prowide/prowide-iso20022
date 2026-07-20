
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
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
@XmlType(name = "Context27", propOrder = {
    "cardDataNtryMd",
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
    "eComrc",
    "eComrcIndPropsd",
    "eComrcIndApld",
    "eComrcData",
    "motoCd",
    "txInitr",
    "delydAuthstn",
    "delydChrgs",
    "noShow",
    "reauthstn",
    "reSubmissn",
    "prtlShipmnt",
    "prtlApprvlSpprtd",
    "vatDcmnttnReq",
    "vatDcmnttnRspn",
    "dtAntcptd",
    "maxPrcgDt",
    "sctyChrtcs",
    "tempScrCardDataReusd",
    "storgLctn",
    "pmtCrdntlMrchntRltsh",
    "prvtData",
    "ntlData"
})
public class Context27 {

    @XmlElement(name = "CardDataNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading11Code cardDataNtryMd;
    @XmlElement(name = "QRCdPresntmntMd")
    @XmlSchemaType(name = "string")
    protected QRCodePresentmentMode2Code qrCdPresntmntMd;
    @XmlElement(name = "MrchntCtgyCd")
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
    @XmlElement(name = "EComrc")
    protected Boolean eComrc;
    @XmlElement(name = "EComrcIndPropsd")
    protected String eComrcIndPropsd;
    @XmlElement(name = "EComrcIndApld")
    protected String eComrcIndApld;
    @XmlElement(name = "EComrcData")
    protected ATICALaxProcessing eComrcData;
    @XmlElement(name = "MOTOCd")
    @XmlSchemaType(name = "string")
    protected MOTO2Code motoCd;
    @XmlElement(name = "TxInitr")
    @XmlSchemaType(name = "string")
    protected TransactionInitiator1Code txInitr;
    @XmlElement(name = "DelydAuthstn")
    protected Boolean delydAuthstn;
    @XmlElement(name = "DelydChrgs")
    protected Boolean delydChrgs;
    @XmlElement(name = "NoShow")
    protected Boolean noShow;
    @XmlElement(name = "Reauthstn")
    protected Boolean reauthstn;
    @XmlElement(name = "ReSubmissn")
    protected Boolean reSubmissn;
    @XmlElement(name = "PrtlShipmnt")
    protected Boolean prtlShipmnt;
    @XmlElement(name = "PrtlApprvlSpprtd")
    protected Boolean prtlApprvlSpprtd;
    @XmlElement(name = "VATDcmnttnReq")
    protected String vatDcmnttnReq;
    @XmlElement(name = "VATDcmnttnRspn")
    protected String vatDcmnttnRspn;
    @XmlElement(name = "DtAntcptd", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtAntcptd;
    @XmlElement(name = "MaxPrcgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maxPrcgDt;
    @XmlElement(name = "SctyChrtcs")
    @XmlSchemaType(name = "string")
    protected List<SecurityCharacteristics2Code> sctyChrtcs;
    @XmlElement(name = "TempScrCardDataReusd")
    protected Boolean tempScrCardDataReusd;
    @XmlElement(name = "StorgLctn")
    protected String storgLctn;
    @XmlElement(name = "PmtCrdntlMrchntRltsh")
    protected Boolean pmtCrdntlMrchntRltsh;
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
    public Context27 setCardDataNtryMd(CardDataReading11Code value) {
        this.cardDataNtryMd = value;
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
    public Context27 setQRCdPresntmntMd(QRCodePresentmentMode2Code value) {
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
    public Context27 setMrchntCtgyCd(String value) {
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
    public Context27 setMrchntCtgySpcfcData(String value) {
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
    public Context27 setOthrMrchntCtgy(String value) {
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
    public Context27 setPOSCondCd(String value) {
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
    public Context27 setCardPres(Boolean value) {
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
    public Context27 setCrdhldrPres(Boolean value) {
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
    public Context27 setCrdhldrActvtd(Boolean value) {
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
    public Context27 setTrnspndrInittd(Boolean value) {
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
    public Context27 setTrnst(Boolean value) {
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
    public Context27 setAttndd(Boolean value) {
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
    public Context27 setUattnddLvlCtgy(String value) {
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
    public Context27 setEComrc(Boolean value) {
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
    public Context27 setEComrcIndPropsd(String value) {
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
    public Context27 setEComrcIndApld(String value) {
        this.eComrcIndApld = value;
        return this;
    }

    /**
     * Gets the value of the eComrcData property.
     * 
     * @return
     *     possible object is
     *     {@link ATICALaxProcessing }
     *     
     */
    public ATICALaxProcessing getEComrcData() {
        return eComrcData;
    }

    /**
     * Sets the value of the eComrcData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATICALaxProcessing }
     *     
     */
    public Context27 setEComrcData(ATICALaxProcessing value) {
        this.eComrcData = value;
        return this;
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
    public Context27 setMOTOCd(MOTO2Code value) {
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
    public Context27 setTxInitr(TransactionInitiator1Code value) {
        this.txInitr = value;
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
    public Context27 setDelydAuthstn(Boolean value) {
        this.delydAuthstn = value;
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
    public Context27 setDelydChrgs(Boolean value) {
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
    public Context27 setNoShow(Boolean value) {
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
    public Context27 setReauthstn(Boolean value) {
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
    public Context27 setReSubmissn(Boolean value) {
        this.reSubmissn = value;
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
    public Context27 setPrtlShipmnt(Boolean value) {
        this.prtlShipmnt = value;
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
    public Context27 setPrtlApprvlSpprtd(Boolean value) {
        this.prtlApprvlSpprtd = value;
        return this;
    }

    /**
     * Gets the value of the vatDcmnttnReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATDcmnttnReq() {
        return vatDcmnttnReq;
    }

    /**
     * Sets the value of the vatDcmnttnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context27 setVATDcmnttnReq(String value) {
        this.vatDcmnttnReq = value;
        return this;
    }

    /**
     * Gets the value of the vatDcmnttnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATDcmnttnRspn() {
        return vatDcmnttnRspn;
    }

    /**
     * Sets the value of the vatDcmnttnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Context27 setVATDcmnttnRspn(String value) {
        this.vatDcmnttnRspn = value;
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
    public Context27 setDtAntcptd(LocalDate value) {
        this.dtAntcptd = value;
        return this;
    }

    /**
     * Gets the value of the maxPrcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxPrcgDt() {
        return maxPrcgDt;
    }

    /**
     * Sets the value of the maxPrcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Context27 setMaxPrcgDt(XMLGregorianCalendar value) {
        this.maxPrcgDt = value;
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
    public Context27 setTempScrCardDataReusd(Boolean value) {
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
    public Context27 setStorgLctn(String value) {
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
    public Context27 setPmtCrdntlMrchntRltsh(Boolean value) {
        this.pmtCrdntlMrchntRltsh = value;
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
     * Adds a new item to the sctyChrtcs list.
     * @see #getSctyChrtcs()
     * 
     */
    public Context27 addSctyChrtcs(SecurityCharacteristics2Code sctyChrtcs) {
        getSctyChrtcs().add(sctyChrtcs);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public Context27 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public Context27 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
