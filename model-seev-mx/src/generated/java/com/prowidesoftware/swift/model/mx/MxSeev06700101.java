
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.067.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "buyrPrtcnInstrRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.067.001.01")
public class MxSeev06700101
    extends AbstractMX
{

    @XmlElement(name = "BuyrPrtcnInstrRpt", required = true)
    protected BuyerProtectionInstructionReportV01 buyrPrtcnInstrRpt;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 67;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AlternatePartyIdentification7 .class, BuyerProtectionInstructionDetails1 .class, BuyerProtectionInstructionReportV01 .class, CorporateActionDetails1 .class, CorporateActionEventType125Choice.class, CorporateActionEventType41Code.class, CorporateActionGeneralInformation195 .class, CorporateActionOption18Code.class, CorporateActionOption47Choice.class, CorporateActionOptionStatement1 .class, DateAndDateTime2Choice.class, DocumentIdentification57 .class, EventFrequency4Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification28 .class, Frequency25Choice.class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericIdentification47 .class, IdentificationType42Choice.class, InstructionProcessingStatus59Choice.class, MxSeev06700101 .class, NameAndAddress5 .class, NoReasonCode.class, Pagination1 .class, PartyIdentification122Choice.class, PartyIdentification143 .class, PendingReason30Code.class, PendingReason74Choice.class, PendingStatus78Choice.class, PendingStatusReason32 .class, PostalAddress1 .class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, RejectedReason65Choice.class, RejectedStatus63Choice.class, RejectedStatusReason62 .class, RejectionReason87Code.class, RelatedSettlementInstruction4 .class, SecuritiesAccountIdentification1Choice.class, Statement87 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification1Code.class, UpdateType16Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.067.001.01";

    public MxSeev06700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev06700101(final String xml) {
        this();
        MxSeev06700101 tmp = parse(xml);
        buyrPrtcnInstrRpt = tmp.getBuyrPrtcnInstrRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev06700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the buyrPrtcnInstrRpt property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProtectionInstructionReportV01 }
     *     
     */
    public BuyerProtectionInstructionReportV01 getBuyrPrtcnInstrRpt() {
        return buyrPrtcnInstrRpt;
    }

    /**
     * Sets the value of the buyrPrtcnInstrRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProtectionInstructionReportV01 }
     *     
     */
    public MxSeev06700101 setBuyrPrtcnInstrRpt(BuyerProtectionInstructionReportV01 value) {
        this.buyrPrtcnInstrRpt = value;
        return this;
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
    public static MxSeev06700101 parse(String xml) {
        return ((MxSeev06700101) MxReadImpl.parse(MxSeev06700101 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev06700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev06700101) MxReadImpl.parse(MxSeev06700101 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev06700101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev06700101) parserImpl.read(MxSeev06700101 .class, xml, _classes));
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
     * Creates an MxSeev06700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev06700101 message
     * @return
     *     a new instance of MxSeev06700101
     */
    public static final MxSeev06700101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev06700101 .class);
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

}
