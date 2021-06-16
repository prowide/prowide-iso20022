
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
 * Class for tsrv.018.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tradStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.018.001.01")
public class MxTsrv01800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TradStsRpt", required = true)
    protected TradeStatusReportV01 tradStsRpt;
    public final static transient String BUSINESS_PROCESS = "tsrv";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CopyDuplicate1Code.class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxTsrv01800101 .class, NamePrefix1Code.class, OrganisationIdentification4 .class, OrganisationIdentification7 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalMessage1 .class, Party10Choice.class, Party11Choice.class, Party6Choice.class, Party9Choice.class, PartyAndSignature2 .class, PartyIdentification32 .class, PartyIdentification42 .class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryData3 .class, StatusReason6Choice.class, StatusReasonInformation8 .class, TradeStatusReport1 .class, TradeStatusReportV01 .class, UndertakingStatus1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsrv.018.001.01";

    public MxTsrv01800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsrv01800101(final String xml) {
        this();
        MxTsrv01800101 tmp = parse(xml);
        tradStsRpt = tmp.getTradStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsrv01800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tradStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeStatusReportV01 }
     *     
     */
    public TradeStatusReportV01 getTradStsRpt() {
        return tradStsRpt;
    }

    /**
     * Sets the value of the tradStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeStatusReportV01 }
     *     
     */
    public MxTsrv01800101 setTradStsRpt(TradeStatusReportV01 value) {
        this.tradStsRpt = value;
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
    public static MxTsrv01800101 parse(String xml) {
        return ((MxTsrv01800101) MxReadImpl.parse(MxTsrv01800101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsrv01800101 parse(String xml, MxRead parserImpl) {
        return ((MxTsrv01800101) parserImpl.read(MxTsrv01800101 .class, xml, _classes));
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
     * Creates an MxTsrv01800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsrv01800101 message
     * @return
     *     a new instance of MxTsrv01800101
     */
    public final static MxTsrv01800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsrv01800101 .class);
    }

}
