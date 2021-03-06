package com.spike.giantdataanalysis.model.logic.relational.expression.raw;

import com.spike.giantdataanalysis.model.logic.relational.core.RelationalAlgebraEnum;

/**
 * Simple id sets(that keyword, which can be id)
 */
public interface SimpleIdSets extends PrimitiveExpression {

  /**
   * <pre>
   charsetNameBase
    : ARMSCII8 | ASCII | BIG5 | CP1250 | CP1251 | CP1256 | CP1257
    | CP850 | CP852 | CP866 | CP932 | DEC8 | EUCJPMS | EUCKR
    | GB2312 | GBK | GEOSTD8 | GREEK | HEBREW | HP8 | KEYBCS2
    | KOI8R | KOI8U | LATIN1 | LATIN2 | LATIN5 | LATIN7 | MACCE
    | MACROMAN | SJIS | SWE7 | TIS620 | UCS2 | UJIS | UTF16
    | UTF16LE | UTF32 | UTF8 | UTF8MB3 | UTF8MB4
    ;
   * </pre>
   */
  public static enum CharsetNameBaseEnum implements RelationalAlgebraEnum {
    ARMSCII8, ASCII, BIG5, CP1250, CP1251, CP1256, CP1257, //
    CP850, CP852, CP866, CP932, DEC8, EUCJPMS, EUCKR, GB2312, //
    GBK, GEOSTD8, GREEK, HEBREW, HP8, KEYBCS2, KOI8R, KOI8U, //
    LATIN1, LATIN2, LATIN5, LATIN7, MACCE, MACROMAN, SJIS, //
    SWE7, TIS620, UCS2, UJIS, UTF16, UTF16LE, UTF32, UTF8, //
    UTF8MB3, UTF8MB4;

    @Override
    public String literal() {
      return name();
    }
  }

  /**
   * <pre>
  transactionLevelBase
    : REPEATABLE | COMMITTED | UNCOMMITTED | SERIALIZABLE
    ;
   * </pre>
   */
  public static enum TransactionLevelBaseEnum implements RelationalAlgebraEnum {
    REPEATABLE, COMMITTED, UNCOMMITTED, SERIALIZABLE;
    @Override
    public String literal() {
      return name();
    }
  }

  /**
   * <pre>
  privilegesBase
    : TABLES | ROUTINE | EXECUTE | FILE | PROCESS
    | RELOAD | SHUTDOWN | SUPER | PRIVILEGES
    ;
   * </pre>
   */
  public static enum PrivilegesBaseEnum implements RelationalAlgebraEnum {
    TABLES, ROUTINE, EXECUTE, FILE, PROCESS, //
    RELOAD, SHUTDOWN, SUPER, PRIVILEGES;
    @Override
    public String literal() {
      return name();
    }
  }

  /**
   * <pre>
  intervalTypeBase
    : QUARTER | MONTH | DAY | HOUR
    | MINUTE | WEEK | SECOND | MICROSECOND
    ;
   * </pre>
   */
  public static enum IntervalTypeBaseEnum implements RelationalAlgebraEnum {
    QUARTER, MONTH, DAY, HOUR, //
    MINUTE, WEEK, SECOND, MICROSECOND;
    @Override
    public String literal() {
      return name();
    }
  }

  /**
   * <pre>
  dataTypeBase
    : DATE | TIME | TIMESTAMP | DATETIME | YEAR | ENUM | TEXT
    ;
   * </pre>
   */
  public static enum DataTypeBaseEnum implements RelationalAlgebraEnum {
    DATE, TIME, TIMESTAMP, DATETIME, YEAR, ENUM, TEXT;
    @Override
    public String literal() {
      return name();
    }
  }

  /**
   * <pre>
  keywordsCanBeId
    : ACCOUNT | ACTION | AFTER | AGGREGATE | ALGORITHM | ANY
    | AT | AUTHORS | AUTOCOMMIT | AUTOEXTEND_SIZE
    | AUTO_INCREMENT | AVG_ROW_LENGTH | BEGIN | BINLOG | BIT
    | BLOCK | BOOL | BOOLEAN | BTREE | CACHE | CASCADED | CHAIN | CHANGED
    | CHANNEL | CHECKSUM | PAGE_CHECKSUM | CIPHER | CLIENT | CLOSE | COALESCE | CODE
    | COLUMNS | COLUMN_FORMAT | COMMENT | COMMIT | COMPACT
    | COMPLETION | COMPRESSED | COMPRESSION | CONCURRENT
    | CONNECTION | CONSISTENT | CONTAINS | CONTEXT
    | CONTRIBUTORS | COPY | CPU | DATA | DATAFILE | DEALLOCATE
    | DEFAULT_AUTH | DEFINER | DELAY_KEY_WRITE | DES_KEY_FILE | DIRECTORY
    | DISABLE | DISCARD | DISK | DO | DUMPFILE | DUPLICATE
    | DYNAMIC | ENABLE | ENCRYPTION | END | ENDS | ENGINE | ENGINES
    | ERROR | ERRORS | ESCAPE | EVEN | EVENT | EVENTS | EVERY
    | EXCHANGE | EXCLUSIVE | EXPIRE | EXPORT | EXTENDED | EXTENT_SIZE | FAST | FAULTS
    | FIELDS | FILE_BLOCK_SIZE | FILTER | FIRST | FIXED | FLUSH
    | FOLLOWS | FOUND | FULL | FUNCTION | GENERAL | GLOBAL | GRANTS
    | GROUP_REPLICATION | HANDLER | HASH | HELP | HOST | HOSTS | IDENTIFIED
    | IGNORE_SERVER_IDS | IMPORT | INDEXES | INITIAL_SIZE
    | INPLACE | INSERT_METHOD | INSTALL | INSTANCE | INTERNAL | INVOKER | IO
    | IO_THREAD | IPC | ISOLATION | ISSUER | JSON | KEY_BLOCK_SIZE
    | LANGUAGE | LAST | LEAVES | LESS | LEVEL | LIST | LOCAL
    | LOGFILE | LOGS | MASTER | MASTER_AUTO_POSITION
    | MASTER_CONNECT_RETRY | MASTER_DELAY
    | MASTER_HEARTBEAT_PERIOD | MASTER_HOST | MASTER_LOG_FILE
    | MASTER_LOG_POS | MASTER_PASSWORD | MASTER_PORT
    | MASTER_RETRY_COUNT | MASTER_SSL | MASTER_SSL_CA
    | MASTER_SSL_CAPATH | MASTER_SSL_CERT | MASTER_SSL_CIPHER
    | MASTER_SSL_CRL | MASTER_SSL_CRLPATH | MASTER_SSL_KEY
    | MASTER_TLS_VERSION | MASTER_USER
    | MAX_CONNECTIONS_PER_HOUR | MAX_QUERIES_PER_HOUR
    | MAX_ROWS | MAX_SIZE | MAX_UPDATES_PER_HOUR
    | MAX_USER_CONNECTIONS | MEDIUM | MEMORY | MERGE | MID | MIGRATE
    | MIN_ROWS | MODE | MODIFY | MUTEX | MYSQL | NAME | NAMES
    | NCHAR | NEVER | NEXT | NO | NODEGROUP | NONE | OFFLINE | OFFSET
    | OJ | OLD_PASSWORD | ONE | ONLINE | ONLY | OPEN | OPTIMIZER_COSTS
    | OPTIONS | OWNER | PACK_KEYS | PAGE | PARSER | PARTIAL
    | PARTITIONING | PARTITIONS | PASSWORD | PHASE | PLUGINS
    | PLUGIN_DIR | PLUGIN | PORT | PRECEDES | PREPARE | PRESERVE | PREV
    | PROCESSLIST | PROFILE | PROFILES | PROXY | QUERY | QUICK
    | REBUILD | RECOVER | REDO_BUFFER_SIZE | REDUNDANT
    | RELAY | RELAYLOG | RELAY_LOG_FILE | RELAY_LOG_POS | REMOVE
    | REORGANIZE | REPAIR | REPLICATE_DO_DB | REPLICATE_DO_TABLE
    | REPLICATE_IGNORE_DB | REPLICATE_IGNORE_TABLE
    | REPLICATE_REWRITE_DB | REPLICATE_WILD_DO_TABLE
    | REPLICATE_WILD_IGNORE_TABLE | REPLICATION | RESET | RESUME
    | RETURNS | ROLLBACK | ROLLUP | ROTATE | ROW | ROWS
    | ROW_FORMAT | SAVEPOINT | SCHEDULE | SECURITY | SERIAL | SERVER
    | SESSION | SHARE | SHARED | SIGNED | SIMPLE | SLAVE
    | SLOW | SNAPSHOT | SOCKET | SOME | SONAME | SOUNDS | SOURCE
    | SQL_AFTER_GTIDS | SQL_AFTER_MTS_GAPS | SQL_BEFORE_GTIDS
    | SQL_BUFFER_RESULT | SQL_CACHE | SQL_NO_CACHE | SQL_THREAD
    | START | STARTS | STATS_AUTO_RECALC | STATS_PERSISTENT
    | STATS_SAMPLE_PAGES | STATUS | STOP | STORAGE | STRING
    | SUBJECT | SUBPARTITION | SUBPARTITIONS | SUSPEND | SWAPS
    | SWITCHES | TABLESPACE | TEMPORARY | TEMPTABLE | THAN | TRADITIONAL
    | TRANSACTION | TRIGGERS | TRUNCATE | UNDEFINED | UNDOFILE
    | UNDO_BUFFER_SIZE | UNINSTALL | UNKNOWN | UNTIL | UPGRADE | USER | USE_FRM | USER_RESOURCES
    | VALIDATION | VALUE | VARIABLES | VIEW | WAIT | WARNINGS | WITHOUT
    | WORK | WRAPPER | X509 | XA | XML
    ;
   * </pre>
   */
  public static enum KeywordsCanBeIdEnum implements RelationalAlgebraEnum {
    ACCOUNT, ACTION, AFTER, AGGREGATE, ALGORITHM, ANY, AT, AUTHORS, AUTOCOMMIT, AUTOEXTEND_SIZE,
    AUTO_INCREMENT, AVG_ROW_LENGTH, BEGIN, BINLOG, BIT, BLOCK, BOOL, BOOLEAN, BTREE, CACHE,
    CASCADED, CHAIN, CHANGED, CHANNEL, CHECKSUM, PAGE_CHECKSUM, CIPHER, CLIENT, CLOSE, COALESCE,
    CODE, COLUMNS, COLUMN_FORMAT, COMMENT, COMMIT, COMPACT, COMPLETION, COMPRESSED, COMPRESSION,
    CONCURRENT, CONNECTION, CONSISTENT, CONTAINS, CONTEXT, CONTRIBUTORS, COPY, CPU, DATA, DATAFILE,
    DEALLOCATE, DEFAULT_AUTH, DEFINER, DELAY_KEY_WRITE, DES_KEY_FILE, DIRECTORY, DISABLE, DISCARD,
    DISK, DO, DUMPFILE, DUPLICATE, DYNAMIC, ENABLE, ENCRYPTION, END, ENDS, ENGINE, ENGINES, ERROR,
    ERRORS, ESCAPE, EVEN, EVENT, EVENTS, EVERY, EXCHANGE, EXCLUSIVE, EXPIRE, EXPORT, EXTENDED,
    EXTENT_SIZE, FAST, FAULTS, FIELDS, FILE_BLOCK_SIZE, FILTER, FIRST, FIXED, FLUSH, FOLLOWS, FOUND,
    FULL, FUNCTION, GENERAL, GLOBAL, GRANTS, GROUP_REPLICATION, HANDLER, HASH, HELP, HOST, HOSTS,
    IDENTIFIED, IGNORE_SERVER_IDS, IMPORT, INDEXES, INITIAL_SIZE, INPLACE, INSERT_METHOD, INSTALL,
    INSTANCE, INTERNAL, INVOKER, IO, IO_THREAD, IPC, ISOLATION, ISSUER, JSON, KEY_BLOCK_SIZE,
    LANGUAGE, LAST, LEAVES, LESS, LEVEL, LIST, LOCAL, LOGFILE, LOGS, MASTER, MASTER_AUTO_POSITION,
    MASTER_CONNECT_RETRY, MASTER_DELAY, MASTER_HEARTBEAT_PERIOD, MASTER_HOST, MASTER_LOG_FILE,
    MASTER_LOG_POS, MASTER_PASSWORD, MASTER_PORT, MASTER_RETRY_COUNT, MASTER_SSL, MASTER_SSL_CA,
    MASTER_SSL_CAPATH, MASTER_SSL_CERT, MASTER_SSL_CIPHER, MASTER_SSL_CRL, MASTER_SSL_CRLPATH,
    MASTER_SSL_KEY, MASTER_TLS_VERSION, MASTER_USER, MAX_CONNECTIONS_PER_HOUR, MAX_QUERIES_PER_HOUR,
    MAX_ROWS, MAX_SIZE, MAX_UPDATES_PER_HOUR, MAX_USER_CONNECTIONS, MEDIUM, MEMORY, MERGE, MID,
    MIGRATE, MIN_ROWS, MODE, MODIFY, MUTEX, MYSQL, NAME, NAMES, NCHAR, NEVER, NEXT, NO, NODEGROUP,
    NONE, OFFLINE, OFFSET, OJ, OLD_PASSWORD, ONE, ONLINE, ONLY, OPEN, OPTIMIZER_COSTS, OPTIONS,
    OWNER, PACK_KEYS, PAGE, PARSER, PARTIAL, PARTITIONING, PARTITIONS, PASSWORD, PHASE, PLUGINS,
    PLUGIN_DIR, PLUGIN, PORT, PRECEDES, PREPARE, PRESERVE, PREV, PROCESSLIST, PROFILE, PROFILES,
    PROXY, QUERY, QUICK, REBUILD, RECOVER, REDO_BUFFER_SIZE, REDUNDANT, RELAY, RELAYLOG,
    RELAY_LOG_FILE, RELAY_LOG_POS, REMOVE, REORGANIZE, REPAIR, REPLICATE_DO_DB, REPLICATE_DO_TABLE,
    REPLICATE_IGNORE_DB, REPLICATE_IGNORE_TABLE, REPLICATE_REWRITE_DB, REPLICATE_WILD_DO_TABLE,
    REPLICATE_WILD_IGNORE_TABLE, REPLICATION, RESET, RESUME, RETURNS, ROLLBACK, ROLLUP, ROTATE, ROW,
    ROWS, ROW_FORMAT, SAVEPOINT, SCHEDULE, SECURITY, SERIAL, SERVER, SESSION, SHARE, SHARED, SIGNED,
    SIMPLE, SLAVE, SLOW, SNAPSHOT, SOCKET, SOME, SONAME, SOUNDS, SOURCE, SQL_AFTER_GTIDS,
    SQL_AFTER_MTS_GAPS, SQL_BEFORE_GTIDS, SQL_BUFFER_RESULT, SQL_CACHE, SQL_NO_CACHE, SQL_THREAD,
    START, STARTS, STATS_AUTO_RECALC, STATS_PERSISTENT, STATS_SAMPLE_PAGES, STATUS, STOP, STORAGE,
    STRING, SUBJECT, SUBPARTITION, SUBPARTITIONS, SUSPEND, SWAPS, SWITCHES, TABLESPACE, TEMPORARY,
    TEMPTABLE, THAN, TRADITIONAL, TRANSACTION, TRIGGERS, TRUNCATE, UNDEFINED, UNDOFILE,
    UNDO_BUFFER_SIZE, UNINSTALL, UNKNOWN, UNTIL, UPGRADE, USER, USE_FRM, USER_RESOURCES, VALIDATION,
    VALUE, VARIABLES, VIEW, WAIT, WARNINGS, WITHOUT, WORK, WRAPPER, X509, XA, XML;

    @Override
    public String literal() {
      return name();
    }
  }

  /**
   * <pre>
  functionNameBase
    : ABS | ACOS | ADDDATE | ADDTIME | AES_DECRYPT | AES_ENCRYPT
    | AREA | ASBINARY | ASIN | ASTEXT | ASWKB | ASWKT
    | ASYMMETRIC_DECRYPT | ASYMMETRIC_DERIVE
    | ASYMMETRIC_ENCRYPT | ASYMMETRIC_SIGN | ASYMMETRIC_VERIFY
    | ATAN | ATAN2 | BENCHMARK | BIN | BIT_COUNT | BIT_LENGTH
    | BUFFER | CEIL | CEILING | CENTROID | CHARACTER_LENGTH
    | CHARSET | CHAR_LENGTH | COERCIBILITY | COLLATION
    | COMPRESS | CONCAT | CONCAT_WS | CONNECTION_ID | CONV
    | CONVERT_TZ | COS | COT | COUNT | CRC32
    | CREATE_ASYMMETRIC_PRIV_KEY | CREATE_ASYMMETRIC_PUB_KEY
    | CREATE_DH_PARAMETERS | CREATE_DIGEST | CROSSES | DATABASE | DATE
    | DATEDIFF | DATE_FORMAT | DAY | DAYNAME | DAYOFMONTH
    | DAYOFWEEK | DAYOFYEAR | DECODE | DEGREES | DES_DECRYPT
    | DES_ENCRYPT | DIMENSION | DISJOINT | ELT | ENCODE
    | ENCRYPT | ENDPOINT | ENVELOPE | EQUALS | EXP | EXPORT_SET
    | EXTERIORRING | EXTRACTVALUE | FIELD | FIND_IN_SET | FLOOR
    | FORMAT | FOUND_ROWS | FROM_BASE64 | FROM_DAYS
    | FROM_UNIXTIME | GEOMCOLLFROMTEXT | GEOMCOLLFROMWKB
    | GEOMETRYCOLLECTION | GEOMETRYCOLLECTIONFROMTEXT
    | GEOMETRYCOLLECTIONFROMWKB | GEOMETRYFROMTEXT
    | GEOMETRYFROMWKB | GEOMETRYN | GEOMETRYTYPE | GEOMFROMTEXT
    | GEOMFROMWKB | GET_FORMAT | GET_LOCK | GLENGTH | GREATEST
    | GTID_SUBSET | GTID_SUBTRACT | HEX | HOUR | IFNULL
    | INET6_ATON | INET6_NTOA | INET_ATON | INET_NTOA | INSTR
    | INTERIORRINGN | INTERSECTS | ISCLOSED | ISEMPTY | ISNULL
    | ISSIMPLE | IS_FREE_LOCK | IS_IPV4 | IS_IPV4_COMPAT
    | IS_IPV4_MAPPED | IS_IPV6 | IS_USED_LOCK | LAST_INSERT_ID
    | LCASE | LEAST | LEFT | LENGTH | LINEFROMTEXT | LINEFROMWKB
    | LINESTRING | LINESTRINGFROMTEXT | LINESTRINGFROMWKB | LN
    | LOAD_FILE | LOCATE | LOG | LOG10 | LOG2 | LOWER | LPAD
    | LTRIM | MAKEDATE | MAKETIME | MAKE_SET | MASTER_POS_WAIT
    | MBRCONTAINS | MBRDISJOINT | MBREQUAL | MBRINTERSECTS
    | MBROVERLAPS | MBRTOUCHES | MBRWITHIN | MD5 | MICROSECOND
    | MINUTE | MLINEFROMTEXT | MLINEFROMWKB | MONTH | MONTHNAME
    | MPOINTFROMTEXT | MPOINTFROMWKB | MPOLYFROMTEXT
    | MPOLYFROMWKB | MULTILINESTRING | MULTILINESTRINGFROMTEXT
    | MULTILINESTRINGFROMWKB | MULTIPOINT | MULTIPOINTFROMTEXT
    | MULTIPOINTFROMWKB | MULTIPOLYGON | MULTIPOLYGONFROMTEXT
    | MULTIPOLYGONFROMWKB | NAME_CONST | NULLIF | NUMGEOMETRIES
    | NUMINTERIORRINGS | NUMPOINTS | OCT | OCTET_LENGTH | ORD
    | OVERLAPS | PERIOD_ADD | PERIOD_DIFF | PI | POINT
    | POINTFROMTEXT | POINTFROMWKB | POINTN | POLYFROMTEXT
    | POLYFROMWKB | POLYGON | POLYGONFROMTEXT | POLYGONFROMWKB
    | POSITION| POW | POWER | QUARTER | QUOTE | RADIANS | RAND
    | RANDOM_BYTES | RELEASE_LOCK | REVERSE | RIGHT | ROUND
    | ROW_COUNT | RPAD | RTRIM | SECOND | SEC_TO_TIME
    | SESSION_USER | SHA | SHA1 | SHA2 | SIGN | SIN | SLEEP
    | SOUNDEX | SQL_THREAD_WAIT_AFTER_GTIDS | SQRT | SRID
    | STARTPOINT | STRCMP | STR_TO_DATE | ST_AREA | ST_ASBINARY
    | ST_ASTEXT | ST_ASWKB | ST_ASWKT | ST_BUFFER | ST_CENTROID
    | ST_CONTAINS | ST_CROSSES | ST_DIFFERENCE | ST_DIMENSION
    | ST_DISJOINT | ST_DISTANCE | ST_ENDPOINT | ST_ENVELOPE
    | ST_EQUALS | ST_EXTERIORRING | ST_GEOMCOLLFROMTEXT
    | ST_GEOMCOLLFROMTXT | ST_GEOMCOLLFROMWKB
    | ST_GEOMETRYCOLLECTIONFROMTEXT
    | ST_GEOMETRYCOLLECTIONFROMWKB | ST_GEOMETRYFROMTEXT
    | ST_GEOMETRYFROMWKB | ST_GEOMETRYN | ST_GEOMETRYTYPE
    | ST_GEOMFROMTEXT | ST_GEOMFROMWKB | ST_INTERIORRINGN
    | ST_INTERSECTION | ST_INTERSECTS | ST_ISCLOSED | ST_ISEMPTY
    | ST_ISSIMPLE | ST_LINEFROMTEXT | ST_LINEFROMWKB
    | ST_LINESTRINGFROMTEXT | ST_LINESTRINGFROMWKB
    | ST_NUMGEOMETRIES | ST_NUMINTERIORRING
    | ST_NUMINTERIORRINGS | ST_NUMPOINTS | ST_OVERLAPS
    | ST_POINTFROMTEXT | ST_POINTFROMWKB | ST_POINTN
    | ST_POLYFROMTEXT | ST_POLYFROMWKB | ST_POLYGONFROMTEXT
    | ST_POLYGONFROMWKB | ST_SRID | ST_STARTPOINT
    | ST_SYMDIFFERENCE | ST_TOUCHES | ST_UNION | ST_WITHIN
    | ST_X | ST_Y | SUBDATE | SUBSTRING_INDEX | SUBTIME
    | SYSTEM_USER | TAN | TIME | TIMEDIFF | TIMESTAMP
    | TIMESTAMPADD | TIMESTAMPDIFF | TIME_FORMAT | TIME_TO_SEC
    | TOUCHES | TO_BASE64 | TO_DAYS | TO_SECONDS | UCASE
    | UNCOMPRESS | UNCOMPRESSED_LENGTH | UNHEX | UNIX_TIMESTAMP
    | UPDATEXML | UPPER | UUID | UUID_SHORT
    | VALIDATE_PASSWORD_STRENGTH | VERSION
    | WAIT_UNTIL_SQL_THREAD_AFTER_GTIDS | WEEK | WEEKDAY
    | WEEKOFYEAR | WEIGHT_STRING | WITHIN | YEAR | YEARWEEK
    | Y_FUNCTION | X_FUNCTION
    ;
   * </pre>
   */
  public static enum FunctionNameBaseEnum implements RelationalAlgebraEnum {
    ABS, ACOS, ADDDATE, ADDTIME, AES_DECRYPT, AES_ENCRYPT, AREA, ASBINARY, ASIN, ASTEXT, ASWKB,
    ASWKT, ASYMMETRIC_DECRYPT, ASYMMETRIC_DERIVE, ASYMMETRIC_ENCRYPT, ASYMMETRIC_SIGN,
    ASYMMETRIC_VERIFY, ATAN, ATAN2, BENCHMARK, BIN, BIT_COUNT, BIT_LENGTH, BUFFER, CEIL, CEILING,
    CENTROID, CHARACTER_LENGTH, CHARSET, CHAR_LENGTH, COERCIBILITY, COLLATION, COMPRESS, CONCAT,
    CONCAT_WS, CONNECTION_ID, CONV, CONVERT_TZ, COS, COT, COUNT, CRC32, CREATE_ASYMMETRIC_PRIV_KEY,
    CREATE_ASYMMETRIC_PUB_KEY, CREATE_DH_PARAMETERS, CREATE_DIGEST, CROSSES, DATABASE, DATE,
    DATEDIFF, DATE_FORMAT, DAY, DAYNAME, DAYOFMONTH, DAYOFWEEK, DAYOFYEAR, DECODE, DEGREES,
    DES_DECRYPT, DES_ENCRYPT, DIMENSION, DISJOINT, ELT, ENCODE, ENCRYPT, ENDPOINT, ENVELOPE, EQUALS,
    EXP, EXPORT_SET, EXTERIORRING, EXTRACTVALUE, FIELD, FIND_IN_SET, FLOOR, FORMAT, FOUND_ROWS,
    FROM_BASE64, FROM_DAYS, FROM_UNIXTIME, GEOMCOLLFROMTEXT, GEOMCOLLFROMWKB, GEOMETRYCOLLECTION,
    GEOMETRYCOLLECTIONFROMTEXT, GEOMETRYCOLLECTIONFROMWKB, GEOMETRYFROMTEXT, GEOMETRYFROMWKB,
    GEOMETRYN, GEOMETRYTYPE, GEOMFROMTEXT, GEOMFROMWKB, GET_FORMAT, GET_LOCK, GLENGTH, GREATEST,
    GTID_SUBSET, GTID_SUBTRACT, HEX, HOUR, IFNULL, INET6_ATON, INET6_NTOA, INET_ATON, INET_NTOA,
    INSTR, INTERIORRINGN, INTERSECTS, ISCLOSED, ISEMPTY, ISNULL, ISSIMPLE, IS_FREE_LOCK, IS_IPV4,
    IS_IPV4_COMPAT, IS_IPV4_MAPPED, IS_IPV6, IS_USED_LOCK, LAST_INSERT_ID, LCASE, LEAST, LEFT,
    LENGTH, LINEFROMTEXT, LINEFROMWKB, LINESTRING, LINESTRINGFROMTEXT, LINESTRINGFROMWKB, LN,
    LOAD_FILE, LOCATE, LOG, LOG10, LOG2, LOWER, LPAD, LTRIM, MAKEDATE, MAKETIME, MAKE_SET,
    MASTER_POS_WAIT, MBRCONTAINS, MBRDISJOINT, MBREQUAL, MBRINTERSECTS, MBROVERLAPS, MBRTOUCHES,
    MBRWITHIN, MD5, MICROSECOND, MINUTE, MLINEFROMTEXT, MLINEFROMWKB, MONTH, MONTHNAME,
    MPOINTFROMTEXT, MPOINTFROMWKB, MPOLYFROMTEXT, MPOLYFROMWKB, MULTILINESTRING,
    MULTILINESTRINGFROMTEXT, MULTILINESTRINGFROMWKB, MULTIPOINT, MULTIPOINTFROMTEXT,
    MULTIPOINTFROMWKB, MULTIPOLYGON, MULTIPOLYGONFROMTEXT, MULTIPOLYGONFROMWKB, NAME_CONST, NULLIF,
    NUMGEOMETRIES, NUMINTERIORRINGS, NUMPOINTS, OCT, OCTET_LENGTH, ORD, OVERLAPS, PERIOD_ADD,
    PERIOD_DIFF, PI, POINT, POINTFROMTEXT, POINTFROMWKB, POINTN, POLYFROMTEXT, POLYFROMWKB, POLYGON,
    POLYGONFROMTEXT, POLYGONFROMWKB, POSITION, POW, POWER, QUARTER, QUOTE, RADIANS, RAND,
    RANDOM_BYTES, RELEASE_LOCK, REVERSE, RIGHT, ROUND, ROW_COUNT, RPAD, RTRIM, SECOND, SEC_TO_TIME,
    SESSION_USER, SHA, SHA1, SHA2, SIGN, SIN, SLEEP, SOUNDEX, SQL_THREAD_WAIT_AFTER_GTIDS, SQRT,
    SRID, STARTPOINT, STRCMP, STR_TO_DATE, ST_AREA, ST_ASBINARY, ST_ASTEXT, ST_ASWKB, ST_ASWKT,
    ST_BUFFER, ST_CENTROID, ST_CONTAINS, ST_CROSSES, ST_DIFFERENCE, ST_DIMENSION, ST_DISJOINT,
    ST_DISTANCE, ST_ENDPOINT, ST_ENVELOPE, ST_EQUALS, ST_EXTERIORRING, ST_GEOMCOLLFROMTEXT,
    ST_GEOMCOLLFROMTXT, ST_GEOMCOLLFROMWKB, ST_GEOMETRYCOLLECTIONFROMTEXT,
    ST_GEOMETRYCOLLECTIONFROMWKB, ST_GEOMETRYFROMTEXT, ST_GEOMETRYFROMWKB, ST_GEOMETRYN,
    ST_GEOMETRYTYPE, ST_GEOMFROMTEXT, ST_GEOMFROMWKB, ST_INTERIORRINGN, ST_INTERSECTION,
    ST_INTERSECTS, ST_ISCLOSED, ST_ISEMPTY, ST_ISSIMPLE, ST_LINEFROMTEXT, ST_LINEFROMWKB,
    ST_LINESTRINGFROMTEXT, ST_LINESTRINGFROMWKB, ST_NUMGEOMETRIES, ST_NUMINTERIORRING,
    ST_NUMINTERIORRINGS, ST_NUMPOINTS, ST_OVERLAPS, ST_POINTFROMTEXT, ST_POINTFROMWKB, ST_POINTN,
    ST_POLYFROMTEXT, ST_POLYFROMWKB, ST_POLYGONFROMTEXT, ST_POLYGONFROMWKB, ST_SRID, ST_STARTPOINT,
    ST_SYMDIFFERENCE, ST_TOUCHES, ST_UNION, ST_WITHIN, ST_X, ST_Y, SUBDATE, SUBSTRING_INDEX,
    SUBTIME, SYSTEM_USER, TAN, TIME, TIMEDIFF, TIMESTAMP, TIMESTAMPADD, TIMESTAMPDIFF, TIME_FORMAT,
    TIME_TO_SEC, TOUCHES, TO_BASE64, TO_DAYS, TO_SECONDS, UCASE, UNCOMPRESS, UNCOMPRESSED_LENGTH,
    UNHEX, UNIX_TIMESTAMP, UPDATEXML, UPPER, UUID, UUID_SHORT, VALIDATE_PASSWORD_STRENGTH, VERSION,
    WAIT_UNTIL_SQL_THREAD_AFTER_GTIDS, WEEK, WEEKDAY, WEEKOFYEAR, WEIGHT_STRING, WITHIN, YEAR,
    YEARWEEK, Y_FUNCTION, X_FUNCTION;

    @Override
    public String literal() {
      return name();
    }
  }

}
