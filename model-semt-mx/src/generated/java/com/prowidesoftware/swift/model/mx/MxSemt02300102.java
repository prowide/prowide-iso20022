
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
 * Class for semt.023.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesEndOfPrcRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.023.001.02")
public class MxSemt02300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesEndOfPrcRpt", required = true)
    protected SecuritiesEndOfProcessReportV02 sctiesEndOfPrcRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 23;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification55Choice.class, AddressType2Code.class, AlternatePartyIdentification8 .class, CashAccountIdentification5Choice.class, ConfirmationParties7 .class, ConfirmationPartyDetails11 .class, ConfirmationPartyDetails12 .class, ConfirmationPartyDetails13 .class, ConfirmationPartyDetails14 .class, DateAndDateTime1Choice.class, Eligibility1Code.class, EventFrequency4Code.class, Frequency25Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification7 .class, IdentificationType43Choice.class, InvestorCapacity4Choice.class, MxSemt02300102 .class, NameAndAddress13 .class, Pagination1 .class, PartyIdentification240Choice.class, PartyIdentificationAndAccount220 .class, PartyTextInformation1 .class, PartyTextInformation5 .class, PostalAddress8 .class, PurposeCode9Choice.class, QueryReference2 .class, Report6 .class, SecuritiesAccount35 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesEndOfProcessReportV02 .class, SimpleIdentificationInformation2 .class, StatementUpdateType1Code.class, StatementUpdateTypeCodeAndDSSCode1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingCapacity4Code.class, TradingCapacity6Code.class, TradingPartyCapacity3Choice.class, TradingPartyCapacity4Choice.class, TypeOfIdentification2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.023.001.02";

    public MxSemt02300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02300102(final String xml) {
        this();
        MxSemt02300102 tmp = parse(xml);
        sctiesEndOfPrcRpt = tmp.getSctiesEndOfPrcRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesEndOfPrcRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesEndOfProcessReportV02 }
     *     
     */
    public SecuritiesEndOfProcessReportV02 getSctiesEndOfPrcRpt() {
        return sctiesEndOfPrcRpt;
    }

    /**
     * Sets the value of the sctiesEndOfPrcRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesEndOfProcessReportV02 }
     *     
     */
    public MxSemt02300102 setSctiesEndOfPrcRpt(SecuritiesEndOfProcessReportV02 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSemt02300102 parse(String xml) {
        return ((MxSemt02300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02300102 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02300102) parserImpl.read(MxSemt02300102 .class, xml, _classes));
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
     * Creates an MxSemt02300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02300102 message
     * @return
     *     a new instance of MxSemt02300102
     */
    public final static MxSemt02300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02300102 .class);
    }

}
