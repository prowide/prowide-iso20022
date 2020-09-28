
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for cbrf.005.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptcptPrflRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:cbrf:xsd:cbrf.005.001.01")
public class MxCbrf00500101
    extends AbstractMX
{

    @XmlElement(name = "PtcptPrflRpt", required = true)
    protected ParticipantProfileReportV01 ptcptPrflRpt;
    public final static transient String BUSINESS_PROCESS = "cbrf";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountLimits1 .class, AccountOwnerAndIdentification1 .class, AccountOwnerAndIdentificationList1 .class, AccountRestrictions1 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, ArrestedFunds1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccount25 .class, CashAccountType2Choice.class, CentralisedAndAuthorisedBranchIdentification1Choice.class, ClearingCircuits1 .class, ClearingScheme1Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CopyDuplicate1Code.class, DailyFundTransfer1Choice.class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DateTimePeriodDetails1 .class, DefaultAccountDetails1 .class, DirectoryAccountInformation1 .class, DirectoryEntry1 .class, DirectoryInformation1 .class, DirectoryParticipantInformation1 .class, DocumentIdentification11 .class, EnglishNameLocalNameAndAddress1 .class, ExternalPaymentSystemDetails1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FinancialInstitutionIdentification9 .class, FinancialInstitutionIdentificationList1 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification47 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GuaranteeFundInformation1 .class, GuaranteeFunds1 .class, LiquidityPoolMembers1Choice.class, MessageHeader3 .class, MxCbrf00500101 .class, NameAndAddress5 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessQuery1 .class, Pagination.class, ParticipantAccount1 .class, ParticipantInformation1 .class, ParticipantProfile1 .class, ParticipantProfileReportV01 .class, Party11Choice.class, PartyIdentification43 .class, PartyIdentification70Choice.class, PartyIdentification77 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress1 .class, PostalAddress19 .class, PostalAddress6 .class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, RestrictionStatus1Choice.class, RestrictionStatus1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemMigration1 .class, TransferEvent1 .class };
    public final static transient String NAMESPACE = "urn:cbrf:xsd:cbrf.005.001.01";

    public MxCbrf00500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCbrf00500101(final String xml) {
        this();
        MxCbrf00500101 tmp = parse(xml);
        ptcptPrflRpt = tmp.getPtcptPrflRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCbrf00500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptcptPrflRpt property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantProfileReportV01 }
     *     
     */
    public ParticipantProfileReportV01 getPtcptPrflRpt() {
        return ptcptPrflRpt;
    }

    /**
     * Sets the value of the ptcptPrflRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantProfileReportV01 }
     *     
     */
    public MxCbrf00500101 setPtcptPrflRpt(ParticipantProfileReportV01 value) {
        this.ptcptPrflRpt = value;
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
    public static MxCbrf00500101 parse(String xml) {
        return ((MxCbrf00500101) MxReadImpl.parse(MxCbrf00500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCbrf00500101 parse(String xml, MxRead parserImpl) {
        return ((MxCbrf00500101) parserImpl.read(MxCbrf00500101 .class, xml, _classes));
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
     * Creates an MxCbrf00500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCbrf00500101 message
     * @return
     *     a new instance of MxCbrf00500101
     */
    public final static MxCbrf00500101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCbrf00500101 .class);
    }

}
