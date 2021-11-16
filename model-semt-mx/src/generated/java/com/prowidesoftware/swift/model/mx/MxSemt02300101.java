
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
 * Class for semt.023.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesEndOfPrcRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.023.001.01")
public class MxSemt02300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesEndOfPrcRpt", required = true)
    protected SecuritiesEndOfProcessReportV01 sctiesEndOfPrcRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 23;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, AddressType2Code.class, AlternatePartyIdentification5 .class, CashAccountIdentification2Choice.class, ConfirmationParties2 .class, ConfirmationPartyDetails1 .class, ConfirmationPartyDetails2 .class, ConfirmationPartyDetails3 .class, ConfirmationPartyDetails5 .class, DateAndDateTime1Choice.class, Eligibility1Code.class, EventFrequency4Code.class, Frequency4Choice.class, GenericIdentification20 .class, GenericIdentification29 .class, GenericIdentification38 .class, GenericIdentification7 .class, IdentificationType40Choice.class, InvestorCapacity3Choice.class, MxSemt02300101 .class, NameAndAddress13 .class, Pagination.class, PartyIdentification32Choice.class, PartyIdentificationAndAccount79 .class, PartyTextInformation1 .class, PartyTextInformation5 .class, PostalAddress8 .class, PurposeCode5Choice.class, QueryReference.class, Report3 .class, SecuritiesAccount3 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesEndOfProcessReportV01 .class, SimpleIdentificationInformation2 .class, StatementUpdateTypeCode.class, StatementUpdateTypeCodeAndDSSCodeChoice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingCapacity4Code.class, TradingCapacity6Code.class, TradingPartyCapacity1Choice.class, TradingPartyCapacity2Choice.class, TypeOfIdentification2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.023.001.01";

    public MxSemt02300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02300101(final String xml) {
        this();
        MxSemt02300101 tmp = parse(xml);
        sctiesEndOfPrcRpt = tmp.getSctiesEndOfPrcRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesEndOfPrcRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesEndOfProcessReportV01 }
     *     
     */
    public SecuritiesEndOfProcessReportV01 getSctiesEndOfPrcRpt() {
        return sctiesEndOfPrcRpt;
    }

    /**
     * Sets the value of the sctiesEndOfPrcRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesEndOfProcessReportV01 }
     *     
     */
    public MxSemt02300101 setSctiesEndOfPrcRpt(SecuritiesEndOfProcessReportV01 value) {
        this.sctiesEndOfPrcRpt = value;
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
    public static MxSemt02300101 parse(String xml) {
        return ((MxSemt02300101) MxReadImpl.parse(MxSemt02300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02300101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02300101) parserImpl.read(MxSemt02300101 .class, xml, _classes));
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
     * Creates an MxSemt02300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02300101 message
     * @return
     *     a new instance of MxSemt02300101
     */
    public final static MxSemt02300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02300101 .class);
    }

}
