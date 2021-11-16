
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for fxtr.036.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradConfReqCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01")
public class MxFxtr03600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradConfReqCxlReq", required = true)
    protected ForeignExchangeTradeConfirmationRequestCancellationRequestV01 fxTradConfReqCxlReq;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 36;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification26 .class, AccountIdentification30 .class, AccountInformationType1Code.class, AddressType2Code.class, ForeignExchangeTradeConfirmationRequestCancellationRequestV01 .class, FundIdentification3 .class, GenericIdentification32 .class, Header23 .class, IdentificationType1Code.class, MessageIdentification1 .class, MxFxtr03600101 .class, NameAndAddress8 .class, OptionParty1Code.class, OptionParty3Code.class, PartyIdentification19Choice.class, PartyIdentification44 .class, PartyIdentification78 .class, PartyIdentification90 .class, PartyIdentificationAndAccount119 .class, PartyIdentificationType1Code.class, PartyType3Code.class, PartyType4Code.class, PostalAddress1 .class, SimpleIdentificationInformation4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradePartyIdentification7 .class, UnderlyingProductIdentifier1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01";

    public MxFxtr03600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr03600101(final String xml) {
        this();
        MxFxtr03600101 tmp = parse(xml);
        fxTradConfReqCxlReq = tmp.getFXTradConfReqCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr03600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradConfReqCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeConfirmationRequestCancellationRequestV01 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 getFXTradConfReqCxlReq() {
        return fxTradConfReqCxlReq;
    }

    /**
     * Sets the value of the fxTradConfReqCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeConfirmationRequestCancellationRequestV01 }
     *     
     */
    public MxFxtr03600101 setFXTradConfReqCxlReq(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 value) {
        this.fxTradConfReqCxlReq = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxFxtr03600101 parse(String xml) {
        return ((MxFxtr03600101) MxReadImpl.parse(MxFxtr03600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr03600101 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr03600101) parserImpl.read(MxFxtr03600101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxFxtr03600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr03600101 message
     * @return
     *     a new instance of MxFxtr03600101
     */
    public final static MxFxtr03600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr03600101 .class);
    }

}
