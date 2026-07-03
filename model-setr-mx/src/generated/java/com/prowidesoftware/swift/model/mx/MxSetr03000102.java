
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for setr.030.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTradConfRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.030.001.02")
public class MxSetr03000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTradConfRspn", required = true)
    protected SecuritiesTradeConfirmationResponseV02 sctiesTradConfRspn;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 30;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification55Choice.class, AddressType2Code.class, AffirmationStatus10Choice.class, AffirmationStatus1Code.class, AlternatePartyIdentification8 .class, Clearing6 .class, ClearingAccountType1Code.class, ClearingSide1Code.class, ConfirmationParties8 .class, ConfirmationPartyDetails12 .class, ConfirmationPartyDetails14 .class, ConfirmationPartyDetails15 .class, DocumentNumber17Choice.class, Eligibility1Code.class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationReference8Choice.class, IdentificationType43Choice.class, InvestorCapacity4Choice.class, Linkages52 .class, MxSetr03000102 .class, NameAndAddress13 .class, PartyIdentification240Choice.class, PartyIdentification243Choice.class, PartyIdentificationAndAccount219 .class, PartyTextInformation1 .class, PartyTextInformation5 .class, PostalAddress8 .class, PurposeCode9Choice.class, SecuritiesAccount20 .class, SecuritiesAccount35 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesTradeConfirmationResponseV02 .class, SimpleIdentificationInformation2 .class, StatusAndReason46 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingCapacity4Code.class, TradingCapacity6Code.class, TradingPartyCapacity3Choice.class, TradingPartyCapacity4Choice.class, TransactiontIdentification4 .class, TypeOfIdentification2Code.class, UnaffirmedReason1Code.class, UnaffirmedReason3Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.030.001.02";

    public MxSetr03000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr03000102(final String xml) {
        this();
        MxSetr03000102 tmp = parse(xml);
        sctiesTradConfRspn = tmp.getSctiesTradConfRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr03000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTradConfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeConfirmationResponseV02 }
     *     
     */
    public SecuritiesTradeConfirmationResponseV02 getSctiesTradConfRspn() {
        return sctiesTradConfRspn;
    }

    /**
     * Sets the value of the sctiesTradConfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeConfirmationResponseV02 }
     *     
     */
    public MxSetr03000102 setSctiesTradConfRspn(SecuritiesTradeConfirmationResponseV02 value) {
        this.sctiesTradConfRspn = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSetr03000102 parse(String xml) {
        return ((MxSetr03000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr03000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr03000102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr03000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr03000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr03000102 parse(String xml, MxRead parserImpl) {
        return ((MxSetr03000102) parserImpl.read(MxSetr03000102 .class, xml, _classes));
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
     * Creates an MxSetr03000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr03000102 message
     * @return
     *     a new instance of MxSetr03000102
     */
    public final static MxSetr03000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr03000102 .class);
    }

}
