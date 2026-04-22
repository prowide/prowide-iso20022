
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
 * Class for semt.028.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.028.001.01")
public class MxSemt02800101
    extends AbstractMX
{

    @XmlElement(name = "IntraPosMvmntQry", required = true)
    protected IntraPositionMovementQueryV01 intraPosMvmntQry;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 28;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AmountRangeBoundary1 .class, DateAndDateTimeSearch5Choice.class, DatePeriod2 .class, DatePeriodSearch1Choice.class, DateTimePeriod1 .class, DateTimeSearch2Choice.class, FinancialInstrumentQuantity1Choice.class, FinancialInstrumentQuantitySearch2 .class, FinancialInstrumentQuantitySearch2Choice.class, FromToAmountRange1 .class, FromToQuantityRange1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, IdentificationSource3Choice.class, ImpliedCurrencyAmountRange1Choice.class, IntraPositionMovementQueryV01 .class, IntraPositionQueryCriteria8 .class, IntraPositionQueryDefinition8 .class, IntraPositionQueryStatus3 .class, IntraPositionStatusType2 .class, IntraPositionType2 .class, MovementResponseType1Code.class, MxSemt02800101 .class, NameAndAddress5 .class, OtherIdentification1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, PriorityNumeric4Choice.class, ProcessingStatus68Choice.class, ProprietaryReason4 .class, QuantityBreakdown32 .class, QuantityRange1Choice.class, QuantityRangeBoundary1 .class, QuantitySearch2Choice.class, References82Choice.class, SecuritiesAccount19 .class, SecuritiesBalanceType11Code.class, SecuritiesBalanceType6Choice.class, SecuritiesSettlementStatus1Code.class, SecuritiesSubBalanceTypeAndQuantityBreakdown3 .class, SecurityIdentification19 .class, SettlementStatus26Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, TransactionProcessingStatus3Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.028.001.01";

    public MxSemt02800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02800101(final String xml) {
        this();
        MxSemt02800101 tmp = parse(xml);
        intraPosMvmntQry = tmp.getIntraPosMvmntQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntQry property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementQueryV01 }
     *     
     */
    public IntraPositionMovementQueryV01 getIntraPosMvmntQry() {
        return intraPosMvmntQry;
    }

    /**
     * Sets the value of the intraPosMvmntQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementQueryV01 }
     *     
     */
    public MxSemt02800101 setIntraPosMvmntQry(IntraPositionMovementQueryV01 value) {
        this.intraPosMvmntQry = value;
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
    public static MxSemt02800101 parse(String xml) {
        return ((MxSemt02800101) MxReadImpl.parse(MxSemt02800101 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02800101) MxReadImpl.parse(MxSemt02800101 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02800101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02800101) parserImpl.read(MxSemt02800101 .class, xml, _classes));
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
     * Creates an MxSemt02800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02800101 message
     * @return
     *     a new instance of MxSemt02800101
     */
    public static final MxSemt02800101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt02800101 .class);
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
